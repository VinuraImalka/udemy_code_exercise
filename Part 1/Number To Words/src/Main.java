public class Main {
    public static void main(String[] args) {
        System.out.println(reverse(100));
        numberToWords(0);
    }

    public static void numberToWords (int number){
        if( number < 0){
            System.out.println("Invalid Value");
        }

        if( number == 0){
            System.out.println("Zero");
        }


        int reverseNumber = reverse(number);
        int digitsOfNumber = getDigitCount(number);
        int digitsOfReverse = getDigitCount(reverseNumber);

        int last = 0;


        while(reverseNumber > 0) {
            last = reverseNumber % 10;

            if(last == 0){
                System.out.println("Zero");
            } else if (last == 1) {
                System.out.println("One");
            }else if (last == 2) {
                System.out.println("Two");
            }else if (last == 3) {
                System.out.println("Three");
            }else if (last == 4) {
                System.out.println("Four");
            }else if (last == 5) {
                System.out.println("Five");
            }else if (last == 6) {
                System.out.println("Six");
            }else if (last == 7) {
                System.out.println("Seven");
            }else if (last == 8) {
                System.out.println("Eight");
            }else if (last == 9) {
                System.out.println("Nine");
            }
            reverseNumber = reverseNumber / 10;
        }

        while (digitsOfNumber > digitsOfReverse) {
            System.out.print("Zero ");
            digitsOfNumber -= 1;
        }


    }

    public static int reverse (int number ){
        int reverse = 0;

        while (number != 0){
            reverse = (reverse * 10) + (number % 10);
            number /= 10;
        }

        return reverse;
    }

    public static int getDigitCount (int number){
        if(number < 0){
            return -1;
        }
        int digitCount = 1;

        while (number > 9 ){
            number = number / 10;
            digitCount ++;
        }
        return digitCount;
    }


}