public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate,
                            double annualSalary){
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay(){
        double salary = Math.round(annualSalary / 26);
        return (isRetired) ? 0.9 * salary: salary;
    }

    public void retire(){
        terminate("2025-12-12");
        isRetired = true;
    }
}