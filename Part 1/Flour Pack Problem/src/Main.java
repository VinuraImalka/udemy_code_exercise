public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(canPack(0,-6,5));
    }
    public static boolean canPack (int bigCount , int smallCount , int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        int big = bigCount * 5;
        int small = smallCount;

        while(big > goal){
            big = big - 5;
            if(big + small >= goal){
                return true;
            }
        }

        if(big + small >= goal){
            return true;
        }else{
            return false;
        }


    }

}