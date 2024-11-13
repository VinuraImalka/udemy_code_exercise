public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("********************");
        System.out.println(hasSameLastDigit(9 ,99,19));
    }

    public static boolean hasSameLastDigit(int x,int y,int z){
        System.out.println(isValid(x));
        System.out.println(isValid(y));
        System.out.println(isValid(z));
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        if(isValid(x)){
            num1 = x % 10;
        }
        if(isValid(y)){
            num2 = y % 10;
        }
        if(isValid(z)){
            num3 = z % 10;
        }
        if (isValid(x) && isValid(y) && isValid(z)){
            if((num1 == num2) || (num1 == num3) || (num2 == num3)){
                return true;
            }
        }
        return false;


    }

    public static boolean isValid (int number) {
        if ((number < 10) || (number > 1000)) {
            return false;
        }
        return true;
    }
}