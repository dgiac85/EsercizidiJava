package com.pellegrinoprincipe;

import java.util.Random;

class Buffer
{
    private int data[]; // dato condiviso
    private int nr_elem = 10; // max elem. di default
    private boolean empty = true; // stato buffer all'inizio 

    public Buffer(int elem) // inizializzo il buffer
    {
        if (elem != -1)
        {
            data = new int[elem];
            nr_elem = elem;
        }
        else
            data = new int[nr_elem];
    }

    public synchronized void write(int val) throws InterruptedException // scrivo nel buffer
     {
        while (!empty) // finché il consumer non ha letto il dato aspetto
        {
            System.out.println(Thread.currentThread().getName() + " attende che CONSUMER legga il dato...");
            wait(); // sospende l'esecuzione e rilascia il monitor
        }

        data[val] = val; // scrivo il dato
        empty = false; // aggiorno lo stato

        System.out.println(Thread.currentThread().getName()
                + " ha scritto all'indice " + val + " il valore: " + data[val]);

         notifyAll(); // notifica della possibilità di riacquisizione del monitor
    }
    public synchronized int read(int ix) throws InterruptedException
    {
        while (empty) // finché il producer non ha scritto il dato aspetto
        {
            System.out.println(Thread.currentThread().getName() + " attende che PRODUCER scriva il dato...");
            wait(); // sospende l'esecuzione e rilascia il monitor
        }

        empty = true; // aggiorno lo stato
        System.out.println(Thread.currentThread().getName()
                + " ha letto all'indice " + ix + " il valore: " + data[ix]);

        notifyAll(); // notifica della possibilità di riacquisizione del monitor
        return data[ix];
    }

    public int getBufferElements(){ return nr_elem; }
}

class RunProducer implements Runnable // Runnable per il thread 1
{
    private Buffer b;

    public RunProducer(Buffer b) { this.b = b; }

    public void run()
    {
        for (int i = 0; i < b.getBufferElements(); i++)
        {
            Random r = new Random();
            int ms = r.nextInt(5000);
            try
            {
                Thread.sleep(ms); // un pò di attesa...
                b.write(i);
            }
            catch (InterruptedException ex) {}
        }
    }
}

class RunConsumer implements Runnable // Runnable per il thread 2
{
    private Buffer b;

    public RunConsumer(Buffer b) { this.b = b; }

    public void run()
    {
        for (int i = 0; i < b.getBufferElements(); i++)
        {
            Random r = new Random();
            int ms = r.nextInt(5000);
            try
            {
                Thread.sleep(ms); // un pò di attesa...
                b.read(i);
            }
            catch (InterruptedException ex) {}
        }
    }
}

public class CoopSynchronizedThread
{
    public static void main(String args[])
    {
        Buffer b = new Buffer(-1); // buffer

        Thread t_1 = new Thread(new RunProducer(b), "PRODUCER"); // creo il PRODUCER
        Thread t_2 = new Thread(new RunConsumer(b), "CONSUMER"); // creo il CONSUMER

        // avvio i threads
        t_1.start();
        t_2.start();
    }
}
