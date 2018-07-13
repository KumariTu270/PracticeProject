package hotelDesignFinal;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Request {
    List<Day> days = new ArrayList<>();
    Customer customer;
    Request(List<Day> days , Customer customer){
       this.days.addAll(days);
       this.customer = customer;
       System.out.println("Added request"+this.days+" "+this.customer);


    }

    List<Category> getCatgories(){
        List<Category> categories = new ArrayList<>();
        for(Day day : days ){
            categories.add(new Category(this.customer , day));
        }
        /*for(Category category : categories){
            System.out.println("Category printing  : "+category.customer+" day : "+category.day);
        }*/
        return  categories;
    }

}
