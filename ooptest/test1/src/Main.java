public class Main {
    public static void main(String[] args) {
        student st1 = new student("s1","twst1",15);
        st1.getDetails();
        st1.getRole();
        st1.doStuff();
        st1.assignclass();
        st1.assignsubject();

        System.out.println("-".repeat(30));
        teacher te1 = new teacher("t1","tsaf1",30);
        te1.getDetails();
        te1.getRole();
        te1.doStuff();
        te1.assignclass();
        te1.assignsubject();
    }
}