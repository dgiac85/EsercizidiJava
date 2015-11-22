package com.pellegrinoprincipe;

public class StackGenericRawTypeCase2
{
    public static void main(String[] args)
    {
        Double d[] =  { 11.1, 11.2, 8.6 };

        // riferimento di tipo raw con oggetto creato non di tipo raw
        StackGeneric sd = new StackGeneric<Double>(3);
       
        for (double e : d) // test push
             sd.push(e);
  
        System.out.print("Valori dello stack Double: "); // test pop
        for (int nr = 0; nr < 3; nr++)
        {
            // ERRORE - incompatible types: Object cannot be converted to Double
            Double d_tmp = sd.pop(); 
            System.out.print(d_tmp + " ");
        }
    }
}
