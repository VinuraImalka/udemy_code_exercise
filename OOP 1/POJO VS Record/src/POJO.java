public class POJO {
    private String id;
    private String name;
    private String DOB;
    private String classList;

    public POJO(String id, String name, String DOB, String classList) {
        this.id = id;
        this.name = name;
        this.DOB = DOB;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "POJO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }
}
