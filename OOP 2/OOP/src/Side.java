public class Side extends Order{

    public Side(int size) {
        super(size);
        System.out.println(getClass().getSimpleName() + " selected");
        this.price = calculatePrice(size,10);
    }

    public static Side createSide(int sideType, int size) {
        return switch (sideType) {
            case 1 -> new FrenchFries(size);
            case 2 -> new OnionRings(size);
            case 3 -> new PotatoChips(size);
            default -> new Side(size);
        };
    }

    public static Side createSide() {
        return createSide(1,1);
    }

    public static Side createSide(int size) {
        return createSide(1,size);
    }

    @Override
    public String toString() {
        return (size==1?"small":(size==2?"medium":"large"))+ " size " + getClass().getSimpleName()
                +" is "+price;
    }
}

class FrenchFries extends Side{
    public FrenchFries(int size) {
        super(size);
    }

    @Override
    public double calculatePrice(int size, double price) {
        return super.calculatePrice(size, 10);
    }
}

class OnionRings extends Side{
    public OnionRings(int size) {
        super(size);
    }

    @Override
    public double calculatePrice(int size, double price) {
        return super.calculatePrice(size, 20);
    }
}

class PotatoChips extends Side{
    public PotatoChips(int size) {
        super(size);
    }

    @Override
    public double calculatePrice(int size, double price) {
        return super.calculatePrice(size, 30);
    }
}
