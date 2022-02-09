package Staff.Managment;

public class Director extends Manager{

    private Double budget;

    public Director(String name, String NI_Number, Double salary, String deptName, Double budget){
        super(name, NI_Number, salary, deptName);
        this.budget = budget;
    }
    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }
}
