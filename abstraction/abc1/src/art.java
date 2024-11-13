public class art extends ProductForSale{


    public art(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(type);
        System.out.printf("%6.2f %n",price);
        System.out.println(description);
    }
}
