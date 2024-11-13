import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);

            System.out.println("""
Enter car type:
    * Gas Powered Car
    * Electric Car
    * Hybrid Car
    * Quit""");
            char type = scanner.nextLine().toLowerCase().charAt(0);
            if(type == 'q'){
                return;
            }
            System.out.println("Enter cars name : ");
            String carName = scanner.nextLine();
            Car car = Car.createCar(type,carName);
            car.drive();
        }
    }
}