public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isOdd (int number){
        if(number < 0 ){
            return false;
        } else if (number % 2 != 0 ) {
            return true;
        }else{
            return false;
        }
    }

    public static int sumOdd (int start , int end){
        if (end >= start && start > 0 && end > 0){
            int sum = 0 ;
            for (int number = start; number <= end ; number ++){
                if(isOdd(number)){
                    sum+= number;
                }
            }
            return sum;
        }else{
            return -1;
        }

    }
}











