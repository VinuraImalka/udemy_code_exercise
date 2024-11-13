public class student extends person implements classAssigned,subjectAssigned{

    public student(String id, String name, int age) {
        super(id, name, age, "student");
    }

    @Override
    public void doStuff() {
        System.out.println("learning");
    }

    @Override
    public void assignclass() {
        System.out.println("student assign to a class");
    }

    @Override
    public void assignsubject() {
        System.out.println("subject assign to a student");
    }
}
