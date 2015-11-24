package com.pellegrinoprincipe;

class Base<T> // classe base
{
    T el;
    public Base(T o) { el = o; } //è il costruttore della classe
    T get() { return el; }
}

class Derived extends Base<String> // classe derivata
{
    public Derived(String o) { super(o); } //viene richiamato il costruttore
    //chiamare sempre il costruttore della classe padre
    String get() // metodo sovrascritto (OVERRIDING DEL METODO)
    {
        System.out.print("Chiamato da Derived: ");
        return el;
    }
}

public class BridgeMethod
{
    public static void main(String[] args)
    {
        Base<String> b = new Derived("bye bye !!!");
        System.out.println(b.get());
    }
}
