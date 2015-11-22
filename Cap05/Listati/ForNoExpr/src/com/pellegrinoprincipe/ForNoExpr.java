package com.pellegrinoprincipe;

public class ForNoExpr
{
    public static void main(String[] args)
    {
        int a = 8;

        System.out.print("a = ");
        for (;;) // ciclo infinito che è interrotto dal break
        {
            if (a < 0)
                break;
            System.out.print(a-- + " ");
        }
    }
}
