package Staff;

public abstract class Employee {

    private String name;
    private String NI_Number;
    private Double Salary;

    public Employee (String name, String NI_Number, Double salary){
        this.name = name;
        this.NI_Number = NI_Number;
        this.Salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNI_Number() {
        return NI_Number;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNI_Number(String NI_Number) {
        this.NI_Number = NI_Number;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public void raiseSalary(Double percent){
        setSalary(this.getSalary() + this.getSalary() * (percent / 100));
    }

    public Double payBonus(){
        return (this.getSalary() * 0.01);
    }
}
