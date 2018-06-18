package com.company;

public class HumanFactory {
    Human getInstance(String str){
        if(str.equalsIgnoreCase("Woman"))
        {
            return new Woman();

        }
        else
            return new Man();
    }

}
