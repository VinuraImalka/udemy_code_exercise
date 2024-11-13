public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Burger burger = new Burger(3);
//        System.out.println(burger);

        Order burger1 = Order.createOder(3,3,2);
        System.out.println(burger1);
        Order[] burger = Order.createOder();
        System.out.println(burger[0].toString());
        System.out.println(burger[1].toString());
        System.out.println(burger[2].toString());

    }
}