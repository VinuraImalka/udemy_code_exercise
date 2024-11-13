public class Order {
    protected int size;
    protected double price;

    public Order(int size) {
        this.size = size;
    }

    public static Order createOder(int mealType, int type, int size){
        switch (mealType){
            case 1 -> {
                Burger burger = Burger.createBurger(type,size);
                burger.toString();
                return burger;
            }
            case 2 ->{
                Drink drink = Drink.createDrink(type,size);
                return drink;
            }
            case 3 ->{
                Side side = Side.createSide(type,size);
                return side;
            }
            default -> {
                System.out.println("please select a valid meal type!");
                return null;
            }
        }
    }

    public static Order[] createOder(){
        Order[] defaultOrder = new Order[3];
        defaultOrder[0] = Burger.createBurger();
        defaultOrder[1] = Drink.createDrink();
        defaultOrder[2] = Side.createSide();
        return defaultOrder;
    }

    public double calculatePrice(int size,double price) {
        return switch (size){
            case 2 -> price*1.5;
            case 3 -> price*2;
            default -> price;//
        };
    }

    public void printOrder(String text ,double price){
        System.out.printf ("%20s:%6.2f%n",text,price);
    }
}

