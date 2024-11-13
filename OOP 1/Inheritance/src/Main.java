public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SalariedEmployee tim = new SalariedEmployee("das","2005-03-16","2024-05-15",35000);
        System.out.println(tim);
        System.out.println("age is " + tim.getAge());
        System.out.println("pay is $ " + tim.collectPay());
        tim.retire();
        System.out.println("retire pay is $ "+ tim.collectPay());
        HourlyEmployee jim = new HourlyEmployee("jim","2000-03-16","2023-05-15",15);
        System.out.println(jim);
        System.out.println("age is " + jim.getAge());
        System.out.println("pay is $ " + jim.collectPay());
        System.out.println("double pay is $ "+ jim.getDoublePay());
    }
}