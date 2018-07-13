package beverageorderingsystem;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Menu {
    Map<Beverage , Integer> beveragesPrice = new LinkedHashMap<>();
    List<Beverage> menuCard = new ArrayList<>();
    Menu(){

        menuCard.add( Beverage.Coffee.CAPPUCCINO);
        menuCard.add(Beverage.Coffee.EXPRESSO);
        menuCard.add(Beverage.Coffee.FRAPE);
        menuCard.add(Beverage.Coffee.LATTE);
        menuCard.add(Beverage.Coffee.OREO);
        menuCard.add(Beverage.ColdDrinks.COCACOLA);
        menuCard.add(Beverage.ColdDrinks.MIRINDA);
        menuCard.add(Beverage.ColdDrinks.PEPSI);
        menuCard.add(Beverage.Tea.BLACK);
        menuCard.add(Beverage.Tea.MASALA);




    }
}
