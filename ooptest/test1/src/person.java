public abstract class person {
    private String id;
    private String name;
    private int age;
    private String role;

    public person(String id, String name, int age ,String role) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public void getDetails(){
        System.out.printf("""
                Id = %s
                Name = %s
                Age = %d
                Role = %s
                """,this.id,this.name,this.age,this.role);
    }

    public void getRole(){
        System.out.printf("Role of %s is %s \n",this.name,this.role);
    }

    public abstract void doStuff();
}
