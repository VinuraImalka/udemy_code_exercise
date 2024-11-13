public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int number = 154;
        while(number >= 10){
            number = number % 10;
        }
        System.out.println(number);
//        System.out.println(isPalindrome(11));

    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int orign = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        if (orign == reverse){
            return true;

        }else{
            return false;

        }

    }
}