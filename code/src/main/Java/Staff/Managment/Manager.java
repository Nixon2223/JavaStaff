package Staff.Managment;

import Staff.Employee;

public abstract class Manager extends Employee {

    private String deptName;

    public Manager(String name, String NI_Number, Double salary, String deptName){
        super(name, NI_Number, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}
