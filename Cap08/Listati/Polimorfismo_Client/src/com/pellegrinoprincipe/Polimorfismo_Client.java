package com.pellegrinoprincipe;

public class Polimorfismo_Client
{
    public static void main(String args[])
    {
        Rectangle r = new Rectangle(new Point2D(10, 10), 5, 3); // un oggetto Rectangle
        Square s = new Square(new Point2D(50, 50), 3);          // un oggetto Square

        Rectangle r2;
        Square s2;

        String output = "Un tipo Rectangle: " + r + " " + "\nUn tipo Square: " + s + "\n";
        r2 = s; // assegno un tipo Square a un tipo Rectangle
        output += "Un tipo Square tramite un riferimento di un tipo Rectangle: " + r2;
        System.out.println(output);

        output = "Verifichiamo il binding dinamico: ";
        if (r2 instanceof Square) // r2 è in effetti un tipo Square e lo riassegno
        {
            output += "*** r2 è a run-time un tipo Square ... riassegniamolo a un tipo Square ***";
            s2 = (Square) r2; //faccio un casting a Square
        }
        else
            output += "r2 non è un tipo Square!";
        System.out.println(output);
    }
}
