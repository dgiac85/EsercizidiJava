package com.pellegrinoprincipe;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CheckedExceptions
{
    public static Scanner FileScanner(String file_name) throws FileNotFoundException
    {
        return new Scanner(new File(file_name));
    }

    public static void main(String[] args)
    {
        //QUESTO FILE ESISTE si trova nella cartelle LISTATI del capitolo 11
        try(Scanner n_scanner = FileScanner("../newjson.json")) // try-with-resources 
        {
            System.out.println("Se vi è un'eccezione non saro' visualizzata!");
        }
        catch (FileNotFoundException fnf)
        {            
            System.out.println("Eccezione. File non trovato. " + 
                               "Forse il nome file e' errato?");
        }
        //QUESTO FILE INVECE NON ESISTE
        try(Scanner n_scanner = FileScanner("newjsons.json")) // try-with-resources
        {
            System.out.println("Se vi è un'eccezione non saro' visualizzata!");
        }
        catch (FileNotFoundException fnf)
        {            
            System.out.println("Eccezione. File non trovato. " + 
                               "Forse il nome file e' errato?");
        }
    }
}
