public class math {

    public static void main(String[] args) {
        double var1 = 20.00;
        double var2 = 80.00;
        double var3 = 100.00;
        double var4 = (var1+ var2)*var3;
        System.out.println("my total " + var4);
        double remainder = var4 % 40.00;

        System.out.println(remainder);

        boolean isNoRemainder = (remainder == 0) ? true : false;

        System.out.println("isNoRemainder = " + isNoRemainder);

        if(!isNoRemainder){
            System.out.println("Got some Remainder ");
        }






    }
}
