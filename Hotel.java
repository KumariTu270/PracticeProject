package designinghotel;

public class Hotel{
    String name;
    int bill;
    Price price = new Price();
    int rating;
    CustomerType customerType;
    Hotel(String name , int rating){
        this.rating = rating;
        this.name = name;
    }

    void setPrice(int regularWeekdayPrice, int regularWeekendPrice, int rewardWeekdayPrice, int rewardWeekendPrice){
        price.setRegularWeekdayPrice(regularWeekdayPrice);
        price.setRegularWeekendPrice(regularWeekendPrice);
        price.setRewardWeekdayPrice(rewardWeekdayPrice);
        price.setRewardWeekendPrice(rewardWeekendPrice);
    }

    int calculate(CustomerType type , int weekDay , int weekendDay){
        if(type == CustomerType.REWARD)
        return bill = (price.getRewardWeekdayPrice()* weekDay + price.getRewardWeekendPrice()*weekendDay);
        else if(type == CustomerType.REGULAR)
            return bill = (price.getRegularWeekdayPrice()* weekDay + price.getRegularWeekendPrice()*weekendDay);
        else
            return 0;
    }
}



