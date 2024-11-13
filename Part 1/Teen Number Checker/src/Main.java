public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        var value = hasTeen(29,99,15);
        System.out.println(value);
    }
    public static boolean hasTeen (int first,int second,int third){
        if(isTeen(first) || isTeen(second) || isTeen(third)){
            return true;
        }
        return false;
    }

    public static boolean isTeen (int number){
        return number >= 13 && number <=19;
    }
}