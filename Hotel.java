package hotelDesignFinal;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Hotel {
    protected String name;
    protected int rating;
    protected Map<Category , Integer> priceCard = new LinkedHashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Map<Category, Integer> getPriceCard() {
        return priceCard;
    }

    public void setPriceCard(Map<Category, Integer> priceCard) {
       this.priceCard = priceCard;
    }

    int getCostOf(List<Category> categories){
        int price = 0;
            for (Category billEvaluation : categories) {
             for(Map.Entry priceCard : priceCard.entrySet()){
                System.out.println("BILL : "+billEvaluation.hashCode());
                 System.out.println("Pricecard : "+ priceCard.getKey().hashCode());
                 if(billEvaluation.hashCode()==  priceCard.getKey().hashCode()){
                    // System.out.println("Price before : "+price);
                    price += (Integer) priceCard.getValue();
                    // System.out.println("Price : "+price);

                     // System.out.println("\n\n\nBILL : "+billEvaluation.hashCode());

                 }
             }
            }
        return price;
    }


}
