import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<employee> employeeList = new ArrayList<>(List.of(
                new employee(1,"das",2023),
                new employee(2,"omdlk",2015),
                new employee(3,"feklm",2027),
                new employee(4,"llds",2010),
                new employee(5,"vsns",2013)
        ));

        employeeList.sort(new employee.employeeComparator<>("yearStarted").reversed());

        for(employee e : employeeList){
            System.out.println(e);
        }


        System.out.println("-".repeat(23));
        List<StoreEmployee> storeEmployeeList = new ArrayList<>(List.of(
                new StoreEmployee(1,"das",2023,"astore"),
                new StoreEmployee(2,"omdlk",2015,"bstore"),
                new StoreEmployee(3,"feklm",2027,"cstore"),
                new StoreEmployee(4,"llds",2010,"dstore"),
                new StoreEmployee(5,"vsns",2013,"estore")
        ));

        var comparator = new employee.employeeComparator<>();
        storeEmployeeList.sort(comparator);

        for(StoreEmployee e : storeEmployeeList){
            System.out.println(e);
        }
    }
}