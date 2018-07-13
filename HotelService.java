package hotelDesignFinal;

import java.util.*;

public class HotelService {
    List<Hotel> hotels = new ArrayList<>();

    HotelService(){


        Category categoryForRegularWeekend = new Category(Customer.REGULAR , Day.WEEKEND);
        Category categoryForRegularWeekday = new Category(Customer.REGULAR , Day.WEEKDAY);
        Category categoryForRewardWeekday = new Category(Customer.REWARD , Day.WEEKDAY);
        Category categoryForRewardWeekend = new Category(Customer.REWARD , Day.WEEKDAY);

        Hotel hotel = new Hotel();
        hotel.setName("Likewood");
        hotel.setRating(3);
        hotel.priceCard.put(categoryForRewardWeekend , 110 );
        hotel.priceCard.put(categoryForRewardWeekday , 120 );
        hotel.priceCard.put(categoryForRegularWeekend , 50 );
        hotel.priceCard.put(categoryForRegularWeekday , 220 );
        hotels.add(hotel);
       // System.out.println("Price "+hotel.priceCard.get(categoryForRegularWeekday));
        //System.out.println("Price "+hotel.priceCard.get(categoryForRegularWeekend));
        //System.out.println("Price "+hotel.priceCard.get(categoryForRewardWeekday));
        hotel = new Hotel();
        hotel.setName("Bridgewood");
        hotel.setRating(4);
        hotel.priceCard.put(categoryForRegularWeekday , 100 );
        hotel.priceCard.put(categoryForRegularWeekend , 220 );
        hotel.priceCard.put(categoryForRewardWeekday, 150 );
        hotel.priceCard.put(categoryForRewardWeekend , 120 );
        hotels.add(hotel);
        hotel = new Hotel();
        hotel.setName("Ridgewood");
        hotel.setRating(5);
        hotel.priceCard.put(categoryForRegularWeekday , 170 );
        hotel.priceCard.put(categoryForRewardWeekday , 110 );
        hotel.priceCard.put(categoryForRegularWeekend , 110 );
        hotel.priceCard.put(categoryForRewardWeekend, 270 );
        hotels.add(hotel);
    }

    Hotel findCheapestHotel(Request clientRequest){
        Hotel cheapsetHotel = new Hotel();
        int leastPrice = Integer.MAX_VALUE;
        int bill=0;
        for(Hotel hotel : hotels){

            bill = hotel.getCostOf(clientRequest.getCatgories());
            System.out.println("NAme : "+hotel.name+"\nBill "+bill);
            leastPrice = Math.min(leastPrice ,bill);
            if(leastPrice == bill){
                 cheapsetHotel = hotel;
            }
        }
       return cheapsetHotel;
    }
}
