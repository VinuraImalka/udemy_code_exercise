public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var value = hasEqualSum(1,1,2);
        System.out.println(value);
    }

    public static boolean hasEqualSum (int first ,int second,int third){
        if(first + second == third){
            return true;

        }
        return false;

    }
}