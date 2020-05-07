package management;

import staff.Employee;

public class Manager extends Employee {

    String deptName;

    public Manager(String name, String nationalInsurance, Double salary, String deptName) {
        super(name, nationalInsurance, salary);
        this.deptName = deptName;
    }


//    getter
    public String getDeptName() {
        return deptName;
    }

//    setter
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }


}
