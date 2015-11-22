package com.pellegrinoprincipe;

class LetteraliNumerici
{
    public static void main(String[] args)
    {
        int d = 10_000_000;        // decimale con separatore
        int o = 010;               // ottale
        int x = 0x10;              // esadecimale
        int b = 0B0000_1111;       // binario con separatore
        long l = 435435435345345L; // valore long

        System.out.println("d = " + d);
        System.out.println("o = " + o);
        System.out.println("x = " + x);
        System.out.println("b = " + b);
        System.out.println("l = " + l);
    }
}
