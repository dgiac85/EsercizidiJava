package com.pellegrinoprincipe;

class StackGeneric<E>
{
    private final int size;
    private int top;
    private E[] elems;

    public StackGeneric() { this(5); }//se non gli do nient elo inizializza a 5
                                      //tramite il costruttore vuoto

    public StackGeneric(int nr)
    {
        size = nr == 0 ? 5 : nr;
        top = -1; // stack inizialmente vuoto
        elems = (E[]) new Object[size];
    }

    public void push(E value) // mette un valore nello stack
    {
        if (top == size - 1)
            System.out.println("Lo stack e' pieno!");
        else
            elems[++top] = value;
    }

    public E pop() // estrae un valore dallo stack
    {
        if (top == -1)
        {
            System.out.println("Lo stack e' vuoto!");
            return null;
        }
        else
            return elems[top--];
    }
}
