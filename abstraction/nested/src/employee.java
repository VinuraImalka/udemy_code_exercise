import java.util.Comparator;

public class employee {

    public employee() {
    }

    public static class employeeComparator <T extends employee> implements Comparator<employee> {

        private String sortType;

        public employeeComparator(){
            this("name");
        }

        public employeeComparator(String sortType){
            this.sortType = sortType;
        }

        @Override
        public int compare(employee o1, employee o2) {
            if(sortType.equalsIgnoreCase("yearStarted")){
                return o1.yearStarted - o2.yearStarted;
            }
            return o1.getName().compareTo(o2.getName());
        }
    }

    private int employeeId;

    private String name;

    private int yearStarted;

    public employee(int employeeId, String name, int yearStarted) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%d %-8s %d".formatted(employeeId,name,yearStarted);
    }
}
