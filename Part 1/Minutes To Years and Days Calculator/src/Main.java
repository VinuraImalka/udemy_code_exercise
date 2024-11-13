public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void printYearsAndDays (long minutes){
        if(minutes < 0 ){
            System.out.println("Invalid Value");
        }
         long years = minutes / 525600;
        long days = (minutes % 525600) / 1440;

        System.out.println(minutes + " m = " + years + " y and " + days + " d");
    }
}