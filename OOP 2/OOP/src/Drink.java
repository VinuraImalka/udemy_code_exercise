public class Drink extends Order{
    private boolean isRefrigerated;

    public Drink(int size) {
        this(size,true);
    }

    public Drink(int size,boolean isRefrigerated) {
        super(size);
        System.out.println(getClass().getSimpleName() + " selected");
        this.isRefrigerated = isRefrigerated;
        this.price = calculatePrice(size,10);
    }

    @Override
    public double calculatePrice(int size, double price) {
        if(isRefrigerated){
            price+=5;
        }
        return super.calculatePrice(size, price);
    }

    public static Drink createDrink(int drinkType, int size) {
        return switch (drinkType) {
            case 1 -> new Coke(size);
            case 2 -> new Pepsi(size);
            case 3 -> new Sprite(size);
            default -> new Drink(size);
        };
    }

    public static Drink createDrink() {
        return createDrink(1,1);
    }

    public static Drink createDrink(int size) {
        return createDrink(1,size);
    }

    @Override
    public String toString() {
        return (size==1?"small":(size==2?"medium":"large"))+ " size " + getClass().getSimpleName()
                +" is "+price;
    }
}

class Coke extends Drink{
    public Coke(int size) {
        super(size);
    }

    @Override
    public double calculatePrice(int size, double price) {
        return super.calculatePrice(size, 10);
    }
}

class Pepsi extends Drink{
    public Pepsi(int size) {
        super(size);
    }

    @Override
    public double calculatePrice(int size, double price) {
        return super.calculatePrice(size, 20);
    }
}

class Sprite extends Drink{
    public Sprite(int size) {
        super(size);
    }

    @Override
    public double calculatePrice(int size, double price) {
        return super.calculatePrice(size, 20);
    }
}

