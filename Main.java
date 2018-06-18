package com.company;

public class Main {

    public static void main(String[] args) {
        HumanFactory Hf = new HumanFactory();
        Human h = Hf.getInstance("Woman");
        h.HairDesp();
	// write your code here
    }
}
