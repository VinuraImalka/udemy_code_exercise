public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printSquareStar(25);
    }

    public static void printSquareStar (int number){
        if(number < 5){
            System.out.println("Invalid Value");
            return;
        }
        String msg = " ".repeat(number);
        for(int row = 1; row <= number; row++){
            if(row == 1 || row == number){
                msg = "*".repeat(number);
                System.out.println(msg);
                msg = " ".repeat(number);
                continue;
            }
            char[] chars = msg.toCharArray();

            for(int col =1; col <= number; col++){
                if (col ==1 || col == number) {
                    chars[0] = '*';
                    chars[number-1] = '*';
                }
                if(row == col){
                    chars[col-1] = '*';
                }
                if(col == number - row + 1){
                    chars[col-1] = '*';
                }
                msg = new String(chars);
            }
            System.out.println(msg);
            msg = " ".repeat(number);
        }
    }
}