package designinghotel;

public class BookingService {
    public Hotel cheapestHotel(CustomerType type , String date){

        String [] dates = date.split(",");
        int weekdayAndWeekend[] = new Duration().getWeeekDayWeekendDay(dates);

        Hotel likewood = new Hotel("Likewood" , 3);
        Hotel ridgewood = new Hotel("Ridgewood" , 4);
        Hotel brigewood = new Hotel("Brigewood" , 5);

        likewood.setPrice(110 , 20 , 120 , 50);
        ridgewood.setPrice(120 , 210 , 130 , 110);
        brigewood.setPrice(190 , 220 , 130 , 20);

        likewood.bill = likewood.calculate(type , weekdayAndWeekend[0] , weekdayAndWeekend[1]);
        ridgewood.bill = ridgewood.calculate(type , weekdayAndWeekend[0] , weekdayAndWeekend[1]);
        brigewood.bill = brigewood.calculate(type , weekdayAndWeekend[0] , weekdayAndWeekend[1]);

        int bill = Math.min(ridgewood.bill, (Math.min(likewood.bill , brigewood.bill)));
        if(bill == likewood.bill)
            return likewood;
        else if(bill == brigewood.bill)
            return brigewood;
        else
            return ridgewood;

    }
}
