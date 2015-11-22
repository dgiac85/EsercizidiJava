package com.pellegrinoprincipe;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

public class WatchServiceDemo
{
    public static void main(String[] args) throws IOException
    {
        // directory per il monitoraggio
        Path path = Paths.get("C:\\MY_JAVA_SOURCES\\WatchDir");

        WatchService watcher = FileSystems.getDefault().newWatchService();
        WatchKey key = path.register(watcher, StandardWatchEventKinds.ENTRY_DELETE,
                                              StandardWatchEventKinds.ENTRY_CREATE,
                                              StandardWatchEventKinds.ENTRY_MODIFY);

        while (true) // loop infinito per il processing degli eventi
        {
            try { key = watcher.take(); } // otteniamo la chiave
            catch (InterruptedException e) {}

            // riceviamo e rimuoviamo una lista degli eventi occorsi
            List<WatchEvent<?>> events = key.pollEvents();
            for (WatchEvent event : events) 
            {
                WatchEvent.Kind<?> kind = event.kind(); // tipo di evento
                WatchEvent<Path> ev = (WatchEvent<Path>) event;
                Path filename = ev.context(); // contesto dell'evento
                
                if(kind == StandardWatchEventKinds.OVERFLOW) // qualche problema...
                    continue;

                if(kind == StandardWatchEventKinds.ENTRY_CREATE)
                    System.out.format("Creazione del file: %s %n", filename);
                if (kind == StandardWatchEventKinds.ENTRY_DELETE)
                    System.out.format("Cancellazione del file: %s %n", filename);
                if(kind == StandardWatchEventKinds.ENTRY_MODIFY)
                    System.out.format("Modifica del file: %s %n", filename);

            }

            boolean valid = key.reset(); // reset della chiave
            if (!valid) break; 
        }
    }
}
