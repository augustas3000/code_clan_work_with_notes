package management;

public class Director extends Manager {
    Double budget;

    public Director(String name, String nationalInsurance, Double salary, String deptName, Double budget) {
        super(name, nationalInsurance, salary, deptName);
        this.budget = budget;
    }


    public Double payBonus() {
        return this.getSalary() * 0.02;
    }

//    getters
    public Double getBudget() {
        return budget;
    }


}
