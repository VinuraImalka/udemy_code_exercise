public class Main {
    public static void main(String[] args) {

        boolean shouldWakeUp = false ;
        barking = true;
        hourOfDay = 7;
        shouldWakeUp();
        System.out.println(shouldWakeUp);
    }

    public static boolean shouldWakeUp (boolean barking , int hourOfDay){

        if(hourOfDay < 0 || hourOfDay >23){
            return false;
        }
        else if (barking && hourOfDay < 8 || hourOfDay > 22) {
            return true;
        }
        else{
            return false;
        }
    }
}