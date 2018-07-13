package hotelDesignFinal;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ClientApplication {
    public static void main(String []args){
        Customer customerType;
        List<Day> days = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter details and dates in dd/mm/yy:");
        while (!sc.hasNext("[A-Za-z]+")) {
            System.out.println("Nope, that's not it!");
            sc.nextLine();
        }
        String customer = sc.nextLine();
        String date = sc.nextLine();
        if(customer.equalsIgnoreCase("Reward")){
            customerType = Customer.REWARD;
        }
        else{
           customerType = Customer.REGULAR;
        }

        String [] dates = date.split(",");
        Date dateFormatter = null;
        for (int i = 0; i < dates.length; i++) {
            try {
                dateFormatter = new SimpleDateFormat("dd/MM/yyyy").parse(dates[i]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            DateFormat df = new SimpleDateFormat("E");
            String str2 = df.format(dateFormatter);
            System.out.println("Day is : "+str2);
            if (str2.equalsIgnoreCase("Sat") || str2.equalsIgnoreCase("Sun"))
                days.add(Day.WEEKEND);
            else {
                days.add(Day.WEEKDAY);
            }
        }
        Request clientRequest = new Request(days , customerType);
        Hotel hotel = new HotelService().findCheapestHotel(clientRequest);
        System.out.println("You should go for : "+hotel.name+" Hotel\n Rating : "+hotel.rating);

    }
}
