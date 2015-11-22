package com.pellegrinoprincipe;

public class Time_Client_REV_6
{
    public static void main(String[] args)
    {
        Time_REV_6 time1 = new Time_REV_6();
        System.out.println(time1.setMinuti(18).setOra(23).setSecondi(20)); // imposto a cascata l'orario
        //Viene chiamato implicitamente toString dal compilatore
        //in questo modo ottengo i valori in cascata grazie alla keyword this
    }
}
