using System;

namespace com.pellegrinoprincipe
{
    class AClass // classe base
    {
        public virtual void printMe() { }
    }
    class AClass_child_1 : AClass // classe figlia di AClass
    {
        public override void printMe() { Console.WriteLine("child 1"); }
    }
    class AClass_child_2 : AClass // classe figlia di AClass
    {
        public override void printMe() { Console.WriteLine("child 2"); }
    }

    class ArgomentoModificabile
    {
        static void aMethod(ref AClass a_class)
        {
            // cambiamo il riferimento del parametro che punterà ad AClass_child_2 
            // ma questo cambierà anche il riferimento dell'argomento
            a_class = new AClass_child_2();
        }

        static void Main(string[] args)
        {
            AClass an_object = new AClass_child_1();
            aMethod(ref an_object);  // passiamo un oggetto che ha un riferimento 
            // ad AClass_child_1
            an_object.printMe(); // qui an_object punterà ora all'oggetto della classe
            // AClass_child_2 
        }
    }
}
