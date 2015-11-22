package com.pellegrinoprincipe;

public class Assertion
{
    public void greaterThan(int nr, int comp) // metodo che valuta una condizione
    {
        // asserzione
        assert nr > comp : "Attenzione " + nr + " non è maggiore di " + comp;
    }

    public static void main(String[] args)
    {
        int n = 100, c = 300;
        new Assertion().greaterThan(n, c);
    }
}
