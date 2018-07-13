package beverageorderingsystem;

public interface Beverage {
    String groupName();
    String label();
    BeverageType type();
    int price();

    enum Coffee implements Beverage {

        LATTE("Latte" , BeverageType.Hot , 40) ,
        CAPPUCCINO("Cappuccino " , BeverageType.Hot , 50 ) ,
        EXPRESSO("Expresso", BeverageType.Hot,30),
        OREO("Oreo", BeverageType.Cold , 110),
        FRAPE("Frape",BeverageType.Cold , 125);

        private final String label;
        private int price;
        private final BeverageType type;
        private int tax;

        Coffee(String label , BeverageType type , int price) {
            this.label = label;
            this.type = type;
            this.price = price;
        }

        public int getTax() {
            return tax;
        }

        public void setTax(int tax) {
            this.tax = tax;
        }

        @Override
        public int price() {
            return price;
        }

        @Override
        public String groupName() {
            return "Coffee";
        }

        @Override
        public String label() {
            return label;
        }

        @Override
        public BeverageType type() {
            return type;
        }
    }

    enum Tea implements Beverage{

        MASALA("Masala", BeverageType.Hot , 15),
        BLACK("Black" , BeverageType.Hot , 10);

        private final String label;
        private final BeverageType type;
        private int price;

        Tea(String label , BeverageType type , int price) {
            this.label = label;
            this.type = type;
            this.price = price;
        }

        @Override
        public int price() {
            return price;
        }

        @Override
        public String groupName() {
            return "Tea";
        }

        @Override
        public String label() {
            return label;
        }

        public BeverageType type() {
            return type;
        }
    }

    enum ColdDrinks implements Beverage{

        COCACOLA("Coca Cola", BeverageType.Cold , 45),
        MIRINDA("Mirinda" , BeverageType.Cold, 45),
        PEPSI("Pepsi" , BeverageType.Cold , 45);

        private final String label;
        private final  BeverageType type;
        private  int price;

        ColdDrinks(String label , BeverageType type , int price) {
            this.label = label;
            this.type = type;
        }

        @Override
        public String groupName() {
            return "Tea";
        }

        @Override
        public String label() {
            return label;
        }

        public BeverageType type() {
            return type;
        }

        @Override
        public int price() {
            return price;
        }
    }

}
