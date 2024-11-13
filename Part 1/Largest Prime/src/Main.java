public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(getLargestPrime(68));
    }

    public static int getLargestPrime(int number){
        if (number <= 1){
            return -1;
        }

        int digit = number /2 ;
        int i = 2;

        while (i <= digit){
            if(number % i == 0){
                System.out.println("not a prime number");
                return number;
            }
            i++;
        }
        System.out.println("prime number");
        return number;


    }

}