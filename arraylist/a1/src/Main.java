import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<String> glist = new ArrayList<>();

    public static void main(String[] args) {

        while(true){
            System.out.println("enter option");
            switch (input.nextInt()){
                case 0 -> {
                    return;
                }
                case 1 ->{
                    add();
                }
                case 2 ->{
                    remove();
                }
                default -> {
                    System.out.println("invalid choice");
                }
            }
            glist.sort((Comparator.naturalOrder()));
            System.out.println(glist);
        }
    }

    public static void add(){
        System.out.println("enter elements:");
        input.nextLine();
        String[] array = input.nextLine().split(",");
//        glist.addAll(List.of(array));
        for(String i : array){
            String trimmed = i.trim();
            if((!glist.contains(trimmed)) && (trimmed != "")){
                glist.add(trimmed);
            }
        }

    }

    public static void remove(){
        System.out.println("remove elements:");
        input.nextLine();
        String[] array = input.nextLine().split(",");
//        glist.removeAll(List.of(array));
        for(String i : array){
            String trimmed = i.trim();
            glist.remove(trimmed);
        }
    }
}