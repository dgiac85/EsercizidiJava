package com.pellegrinoprincipe;

public class Man
{
    private String cognome;
    private String nome;
    private Time_REV_5 working_time; // oggetto di tipo Time_REV_5

    public Man(String c, String n, int o)
    {
        cognome = c;
        nome = n;
        working_time = new Time_REV_5(o); // impostazione dell'orario
    }

    public String toString()
    {
        return cognome + " " + nome + " va a lavorare alle ore: "
                       + working_time.getOra();
    }
}
