package AkshaySir;

import java.util.Scanner;

public class Pattern {

    public static void patternPrinting(int input)
    {
        int j =0;
        for(int i = 1 ; i<= (2*input)-1 ; i++) {
            if(i<=input) {
                for ( j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            }
            else{
                for(int k=1 ; k<j ; k++)
                    System.out.print(k+" ");
            }
            j--;


            System.out.println();
        }


    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        patternPrinting(input);

    }
}
