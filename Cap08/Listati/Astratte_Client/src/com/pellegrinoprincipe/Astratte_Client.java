package com.pellegrinoprincipe;

public class Astratte_Client
{
    public static void main(String args[])
    {
        Employee e; //PUO ESSERE SIA UN INGEGNERE CHE UN TECNICO CHE UN OPERAIO
        //QUINDI NON MI RESTA CHE RENDERE EMPLOYEE UNA CLASSE ASTRATTA!
        Engineer eng = new Engineer("Pellegrino", "Principe", 10, 1000);
        Technician tec = new Technician("Paolo", "Canali", 800, 3);
        Laborer lab = new Laborer("Aldo", "Falco", 2, 44);

        e = eng; // ora è un Engineer IMPOSTO PER PRIMA IL RIFERIMENTO DI ENGINEER AD EMPLOYEE
        System.out.print(e.toString() + e.earning());

        e = tec; // ora è un Technician   
        System.out.print(" | " + e.toString() + e.earning());

        e = lab; // ora è un Laborer
        System.out.println(" | " + e.toString() + e.earning());
    }
}
