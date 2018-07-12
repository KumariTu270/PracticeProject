package designinghotel;

import java.util.Scanner;

public class ClientApplication {
    public static void main(String []args){
        CustomerType type;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter details and dates in dd/mm/yy:");
        while (!sc.hasNext("[A-Za-z]+")) {
            System.out.println("Nope, that's not it!");
            sc.nextLine();
        }
        String customer = sc.nextLine();
        String date = sc.nextLine();
        if(customer.equalsIgnoreCase("Reward")){
            type = CustomerType.REWARD;
        }
        else{
            type = CustomerType.REGULAR;
        }

        Hotel h = new BookingService().cheapestHotel(type ,date);
        System.out.println("You should go for : "+h.name+" Hotel\n Rating : "+h.rating);

    }
}
