public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPerfectNumber(-5));
    }

    public static boolean isPerfectNumber (int number) {
        if(number < 1){
            return false;
        }


        int sum = 0;
        for (int x=1; x<number ;x++){
            if( number % x ==0){
                sum += x;
            }
        }
        if(sum == number){
            return true;
        }else{
            return false;
        }

    }
}