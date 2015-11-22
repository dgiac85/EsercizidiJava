package com.pellegrinoprincipe;

public class AnnCustom
{
    @WorkToDo (developer = "Pellegrino Principe", 
               msg = "Inizio calcolo somme",
               start_date = "05/01/2014")    
    public static void calculator(){ System.out.println("DONE!"); }

    public static void main(String[] args)
    {
        calculator();
    }
}
