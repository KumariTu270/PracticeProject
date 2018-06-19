package com.company;

//abstraction
 abstract class Human{


     //ENCAPSULATION : as binding of code and data together
     String hair;
    void Feature(){}


    //Polymorphism
     void ConsumeThroughMouth(String str) {
         if (str.equalsIgnoreCase("Solid")) {
             System.out.println(" usage of teeth");
         }
         else
             ConsumeThroughMouth();
     }

     void ConsumeThroughMouth() {
         System.out.println("Drinking :  usage of tongue");
     }
}


//inheritance
class Woman extends Human {

     Woman()
     {
         this.hair = "Long hair";
     }
    void Feature()
    {
        System.out.println("Woman : Creator of universe");
    }
}

class Man extends Human{



     Man()
     {
         hair = "Short hair";
     }

    void Feature()
    {
        System.out.println(" MAN : Emotionally more stronger than woman");
    }

 }

public class HumanMain {

     public static void main(String []args)
     {
         Human h;
         h = new Woman();
         h.Feature();
         h.ConsumeThroughMouth("Solid");

         h = new Man();
         h.Feature();
         h.ConsumeThroughMouth("Drink");

     }
}
