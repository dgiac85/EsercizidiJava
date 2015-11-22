package com.pellegrinoprincipe;

public class StackGenericRawTypeCase3
{
    public static void main(String[] args)
    {
        Double d[] =  { 11.1, 11.2, 8.6 };

        // riferimento non di tipo raw con oggetto creato di tipo raw
        StackGeneric <Double>sd = new StackGeneric(3);
       
        for (double e : d) // test push
             sd.push(e);
  
        System.out.print("Valori dello stack Double: "); // test pop
        for (int nr = 0; nr < 3; nr++)
        {
            Double d_tmp = sd.pop(); 
            System.out.print(d_tmp + " ");
        }
    }
}
