package com.pellegrinoprincipe;

public class AnnFunctionalInterface
{
    public static void makeProcessing(AFunctionalInterface fi)
    {
        fi.process();
    }

    public static void main(String[] args)
    {
        makeProcessing(() -> System.out.println("I'm processing..."));
    }
}
