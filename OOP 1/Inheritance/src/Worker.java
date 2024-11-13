public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    public Worker (String name,String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        return (2024-(Integer.parseInt(birthDate.substring(0,4))));
    }

    public double collectPay(){
        return 0.00;
    }

    public void terminate(String endDate){
        this.endDate=endDate;
    }

    public String toString() {
        return "Worker{" +
                "name = " + name + "'" +
                "birthDate = " + birthDate + "'" +
                "endDate = " + endDate + "'" +
                "}";
    }
}
