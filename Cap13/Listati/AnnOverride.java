package com.pellegrinoprincipe;

class Base
{
    public void M1() {}
}

class Derived extends Base
{
    @Override
    public void M1() {} // qui nessun errore perché il metodo M1 è presente
                        // nella sua classe base
}

class Derived2 extends Base
{
    @Override
    public void M() {} // qui errore perché il metodo M non è presente 
                       // nella sua classe base
}

public class AnnOverride
{
    public static void main(String[] args) {}
}
