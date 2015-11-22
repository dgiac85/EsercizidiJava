package com.pellegrinoprincipe;

import java.util.Random;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;

class Math // operazioni comuni...
{
    public String toString() { return "[Math]"; }
}

class Operations extends Math
{
    private double result;
    private double data;

    public double get(int min, int max)
    {
        DoubleSupplier d_s = () ->
        {
            System.out.println("Riferimento this in d_s dal metodo get: " + this
                                + "\nRiferimento super in d_s dal metodo get: " + super.toString());
            Random r = new Random();
            Double d = r.nextDouble();
            result = min + (max - min) * d;
            return result;
        };
        return d_s.getAsDouble();
    }

    public void set(int min, int max)
    {
        // esempio "forzato" ma utile per spiegare il comportamento di this e super
        class Consumer
        {
            public String toString() { return "[Consumer]"; }
        }
        class MyDoubleConsumer extends Consumer implements DoubleConsumer
        {
            public void accept(double value)
            {
                System.out.println("Riferimento this in m_d_c dal metodo set: " + this
                                    + "\nRiferimento super in m_d_c dal metodo set: " + super.toString());
            }

            public String toString() { return "[MyDoubleConsumer]"; }
        }
        MyDoubleConsumer m_d_c = new MyDoubleConsumer();
        m_d_c.accept(min / max);
    }
    public String toString() { return "[Operations]"; }
}

public class ThisAndSuper
{
    public static void main(String args[])
    {
        Operations op = new Operations();
        op.get(1, 10);
        op.set(100, 2000);
    }
}
