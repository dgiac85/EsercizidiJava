package com.pellegrinoprincipe;

class Base<T> // classe base
{
    T el;
    public Base(T o) { el = o; }
    T get() { return el; }
}

class Derived extends Base<String> // classe derivata
{
    public Derived(String o) { super(o); }
    String get() // metodo sovrascritto
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
