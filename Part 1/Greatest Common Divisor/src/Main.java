public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int getGreatestCommonDivisor (int first , int second){
        if(first < 10 || second < 10){
            return -1;
        }
        int min = first < second ? first : second;
        int gcd = 1;
        for (int num = 1; num <= min; num++) {
            if (first % num == 0 && second % num == 0) {
                gcd = num;
            }
        }
        return gcd;
    }


}