package hotelDesignFinal;

public class Category {
    protected Customer customer;
    protected Day day;
    Category(Customer customer , Day day){
        this.customer = customer;
        this.day = day;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result+customer.hashCode();
        result = 31*result+day.hashCode();
        return result;
    }
}
