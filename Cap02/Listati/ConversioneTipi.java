package com.pellegrinoprincipe;

public class ConversioneTipi
{
    public static void main(String[] args)
    {
        int a = 260;
        double d = 323.123;
        byte b;

        // il risultato sarà infatti 260 % 256 che darà come resto 4
        System.out.println("b = (byte) a ---> " + (b = (byte) a));

        // il risultato sarà 67 infatti prima 323.123 sarà troncato in 323 
        // e poi si farà 323 % 256
        // che darà come resto appunto 67
        System.out.println("b = (double) d ---> " + (b = (byte) d));
    }
}
