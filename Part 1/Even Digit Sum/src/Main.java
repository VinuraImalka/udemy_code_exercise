public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(getEvenDigitSum(-123456789));
    }

    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }

        int num =number ;
        int sum =0 ;
        while(num > 0){
            int digit = num % 10;
            if(digit % 2 == 0 ){
                sum = sum + digit;

            }

            num = num / 10;

        }
        return sum;
    }
}