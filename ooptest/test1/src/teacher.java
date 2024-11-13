public class teacher extends person implements subjectAssigned,classAssigned{

    public teacher(String id, String name, int age) {
        super(id, name, age, "teacher");
    }

    @Override
    public void doStuff() {
        System.out.println("teaching");
    }

    @Override
    public void assignclass() {
        System.out.println("teacher assign to a class");
    }

    @Override
    public void assignsubject() {
        System.out.println("subject assign to a teacher");
    }
}
