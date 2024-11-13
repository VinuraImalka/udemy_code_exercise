import java.util.Scanner;

public class Burger extends Order{
    protected String[] toppings = {"Tomato", "Onion"};
    private double priceWithToppings;

    public Burger(int size) {
        super(size);
        System.out.println(getClass().getSimpleName() + " selected");
        this.price = calculatePrice(size,10);
        this.toppings = getToppings(3);
        this.priceWithToppings = calculatePriceWithToppings(toppings);
    }

    public String[] getToppings(int maxNumberOfToppings){
        toppings = new String[3];//////3 or maxNumberOfToppings///////
        boolean toppingsSelected = false;
        boolean isToppingInvalid;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select number of toppings for the "+getClass().getSimpleName()+":");
        int numberOfToppings = scanner.nextInt();
        if(numberOfToppings > maxNumberOfToppings){
            System.out.printf("maximum number of toppings for "+getClass().getSimpleName()+" is %d!%n",maxNumberOfToppings);
            return getToppings(maxNumberOfToppings);
        }
        System.out.println("Select the toppings:");
        System.out.println("""
                1.Lettuce
                2.Tomato
                3.Onion
                4.Pickles
                5.Cheese""");

        for (int count = 1;count <= numberOfToppings; count++){
            toppingsSelected = true;
            do{
                isToppingInvalid = false;
                int userChoice = scanner.nextInt();
                switch (userChoice){
                    case 1 ->  toppings[count-1] ="Lettuce";
                    case 2 ->  toppings[count-1] ="Tomato";
                    case 3 ->  toppings[count-1] ="Onion";
                    case 4 ->  toppings[count-1] ="Pickles";
                    case 5 ->  toppings[count-1] ="Cheese";
                    default -> {
                        System.out.println("please select a valid burger topping for the "+getClass().getSimpleName()+":");
                        isToppingInvalid = true;
                    }
                };
            }while(isToppingInvalid);
            System.out.println(toppings[count-1] + " is selected as a topping for your "+getClass().getSimpleName());
        }
        if(!toppingsSelected){
            System.out.println("No toppings is selected");
        }
        return toppings;
    }

    public static Burger createBurger(int burgerType, int size) {
        return switch (burgerType) {
            case 1 -> new chickenBurger(size);
            case 2 -> new veggieBurger(size);
            case 3 -> new beefBurger(size);
            case 4 -> new deluxBurger(size);
            default -> new Burger(size);
        };
    }

    public static Burger createBurger() {
        return createBurger(1,2);
    }

    public static Burger createBurger(int size) {
        return createBurger(1,size);
    }

    public double calculatePriceWithToppings(String[] toppings) {
        for(String topping : toppings){
//            System.out.println(price);
            price += switch (topping){
                case "Lettuce" ->  2;
                case "Tomato" -> 4;
                case "Onion" -> 6;
                case "Pickles" -> 8;
                case "Cheese" -> 10;
                case null -> 0;// default should handle null??
                default -> 0;
            };
        }
        return price;
    }

    @Override
    public String toString() {
        int count = 0;
        for (String topping : toppings) {
            if (topping != null) {
                count++;
            }
        }
        String[] toppingsNames = new String[count];
        for (int i = 0; i < toppingsNames.length; i++) {
            toppingsNames[i] = toppings[i];
        }
        String toppingsString = String.join(",",toppingsNames);

        return (size==1?"small":(size==2?"medium":"large"))+ " size " + getClass().getSimpleName()
                +" with "+ toppingsString +" toppings is "+price;
    }
}

class chickenBurger extends Burger{
    public chickenBurger(int size) {
        super(size);

    }

    @Override
    public String[] getToppings(int maxNumberOfToppings) {
        return toppings;
    }

    @Override
    public double calculatePrice(int size, double price) {
        return super.calculatePrice(size, 50);
    }
}

class veggieBurger extends Burger{
    public veggieBurger(int size) {
        super(size);
    }

    @Override
    public double calculatePrice(int size, double price) {
        return super.calculatePrice(size, 25);
    }
}

class beefBurger extends Burger{
    public beefBurger(int size) {
        super(size);
    }

    @Override
    public double calculatePrice(int size, double price) {
        return super.calculatePrice(size, 100);
    }
}

class deluxBurger extends Burger{
    public deluxBurger(int size) {
        super(size);
    }

    @Override
    public double calculatePrice(int size, double price) {
        return super.calculatePrice(size, 150);
    }

    @Override
    public String[] getToppings(int maxNumberOfToppings) {
        return super.getToppings(2);
    }
}