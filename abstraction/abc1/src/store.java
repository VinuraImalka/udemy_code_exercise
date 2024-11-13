import java.util.ArrayList;

record OrderItem(int qty,ProductForSale product){}

public class store {

    private static ArrayList<ProductForSale> products = new ArrayList<>();
    public static void main(String[] args) {
        products.add(new art("art1",100,"acdga"));
        products.add(new art("art2",200,"dkmvrg"));
        print();

        System.out.println("order1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1,1,2);
        addItemToOrder(order1,0,1);
        printOrder(order1);
    }

    public static void print(){
        for(var product : products){
            System.out.println();
            product.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order,int orderIndex,int qty){
        order.add(new OrderItem(qty,products.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double sales = 0;
        for(var item : order){
            item.product().printPricedItem(item.qty());
            sales += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("%6.2f %n",sales);
    }

}
