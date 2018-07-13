package beverageorderingsystem;

import java.util.Scanner;

public class ClientApplication {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Hot.Coffee.Latte = Rs.40\n2.Hot.Coffee.Cappucino = Rs. 50\n3.Hot.Coffee.Expresso");
        System.out.println("Select the items from the catalog : ");
        String input = scanner.nextLine();
        String []choices = input.split(",");
        int []clientChoice = new int[choices.length] ;
        for(int i =0 ;i<choices.length ; i++){
            clientChoice[i]=Integer.parseInt(choices[i]);
        }





    }
}
