public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        int aInt = (int)(a * 1000);
        int bInt = (int)(b * 1000);
        return aInt == bInt;
    }
}