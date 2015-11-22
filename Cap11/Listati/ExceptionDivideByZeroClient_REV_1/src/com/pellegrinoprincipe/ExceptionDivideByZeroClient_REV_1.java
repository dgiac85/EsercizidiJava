package com.pellegrinoprincipe;

class ExceptionDivideByZero_REV_1 extends ArithmeticException
{
    private static String msg = "Eccezione: divisione per 0.";
    private int ix;

    public ExceptionDivideByZero_REV_1()
    {
        super(msg);
        ix = 0;
    }

    // costruttore che registra anche la posizione dell'elemento causa dell'eccezione
    public ExceptionDivideByZero_REV_1(int n)
    {
        super(msg);
        ix = n;
    }

    public String what() // messaggio dell'eccezione
    {
        return msg + " alla posizione dell'array " + ix;
    }

    // posizione dell'elemento dell'array che ha generato l'eccezione
    public int getPos() { return ix; }
}

public class ExceptionDivideByZeroClient_REV_1
{
    private static final int num = 22; // numero da dividere

    public static void makeDiv(int num, int denom, int ix) // metodo per fare 
                                                           // la divisione
    {
        if (denom == 0)
            throw new ExceptionDivideByZero_REV_1(ix);
        else
            System.out.println("Divisione di " + num + " per " + denom + " = " + num / denom);
    }

    public static void loopIn(int start, int num, int denom[]) // ciclo nell'array di denominatori
    {
        for (int n = start; n < denom.length; n++)
        {
            try
            {
                makeDiv(num, denom[n], n);
            }
            catch (ExceptionDivideByZero_REV_1 e)
            {
                System.out.print(e.what());
                throw e; // rilanciamo l'eccezione
            }
        }
    }

    // provo comunque a gestire l'eccezione senza interrompere il programma
    public static void tryToResolve(int denom[], int pos) 
    {
        denom[pos] = 1;

        try
        {
            loopIn(pos, num, denom);
        }
        catch (ExceptionDivideByZero_REV_1 e)
        {
            System.out.println(" risolvo forzando il denominatore a 1...");
            tryToResolve(denom, e.getPos());
        }
    }

    public static void main(String args[])
    {
        int denom[] = {11, 0, 2, 0};

        try
        {
            loopIn(0, num, denom);
        }
        catch (ExceptionDivideByZero_REV_1 e)
        {
            System.out.println(" risolvo forzando il denominatore a 1...");
            tryToResolve(denom, e.getPos());
        }
    }
}
