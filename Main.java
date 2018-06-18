package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    //try with resources for java 1.7 and above
    public static void main(String[] args) throws IOException {



        try(BufferedReader br  = new BufferedReader(new InputStreamReader(System.in)))
        {
            String str = "";
            str = br.readLine();
        }

	// write your code here
    }
}
