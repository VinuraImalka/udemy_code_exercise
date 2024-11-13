import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        long avg = 0;
        int count = 0;
        boolean is_integer = true;
        Scanner scanner = new Scanner(System.in);
        do{
            try{
                int num = scanner.nextInt();
                count++;
                sum += num;
                avg =sum / count;
            }catch (InputMismatchException error){
                System.out.println("SUM = "+sum+" AVG = "+avg);
                is_integer = false;
            }
        }while (is_integer);
    }




}