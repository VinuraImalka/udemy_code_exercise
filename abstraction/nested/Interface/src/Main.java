public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyInt myInt = () -> System.out.println("hello");
        myInt.msg();
    }
}