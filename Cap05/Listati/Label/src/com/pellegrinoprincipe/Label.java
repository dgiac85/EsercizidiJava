package com.pellegrinoprincipe;

public class Label
{
    public static void main(String[] args)
    {
        String output = "";

        nr: // label
        for (int row = 1; row <= 5; row++)
        {
            for (int col = 1; col <= 10; col++)
            {
                if (col == 5) // se col == 5 termina il for etichettato nr
                    break nr;
                output += "#";
            }
        }
        System.out.println(output);
    }
}
