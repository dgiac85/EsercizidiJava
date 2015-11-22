package com.pellegrinoprincipe;

import java.util.function.IntBinaryOperator;

class MyInteger
{
    public int sum(int left, int right)
    {
        return left + right;
    }
}

@FunctionalInterface
interface MyIntBinaryOperator
{
    int applyAsInt(MyInteger m, int a, int b);
}

public class RiferimentiAMetodi
{
    public static void main(String[] args)
    {
        // I MODALITA': old-style prima di Java 8
        IntBinaryOperator bo_1 = new IntBinaryOperator()
        {
            public int applyAsInt(int left, int right)
            {
                return left + right;
            }
        };
        System.out.println("Risultato bo_1: " + bo_1.applyAsInt(10, 10));

        // II MODALITA': Java 8 - lambda expressions
        IntBinaryOperator bo_2 = (left, right) -> left + right;
        System.out.println("Risultato bo_2: " + bo_2.applyAsInt(10, 10));

        // III MODALITA': Java 8 - Riferimento a un metodo statico
        IntBinaryOperator bo_3 = Integer::sum;
        System.out.println("Risultato bo_3: " + bo_3.applyAsInt(10, 10));

        // IV MODALITA': Java 8 - Riferimento a un metodo di istanza di un oggetto specifico
        MyInteger mi = new MyInteger();
        IntBinaryOperator bo_4 = mi::sum;
        System.out.println("Risultato bo_4: " + bo_4.applyAsInt(10, 10));

        // V MODALITA': Java 8 - Riferimento a un metodo di istanza di un oggetto arbitrario
        // di un tipo specifico
        MyIntBinaryOperator bo_5 = MyInteger::sum;
        System.out.println("Risultato bo_5: " + bo_5.applyAsInt(new MyInteger(), 10, 10));
    }
}
