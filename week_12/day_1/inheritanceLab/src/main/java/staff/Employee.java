package staff;

// On a practical level an abstract class is a class that is
// never instantiated - we will never create an object of that
// class’s type. However, we will often use abstract classes as
// a parents for other classes (via inheritance).

//parent class Employee has a constructor with name, NI, and salary,
//that will be used by subclasses in such way that....

import com.sun.istack.internal.NotNull;

public abstract class Employee {

    String name;
    String nationalInsurance;
    Double salary;

    public Employee(String name, String nationalInsurance, Double salary) {
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.salary = salary;
    }

//    raise salary
    public void raiseSalary(Double increment) {
        if (increment < 0.0)
            throw new IllegalArgumentException("Salary increment cannot be negative.");
        this.salary += increment;
    }

//    pay bonus
    public Double payBonus() {
        return this.salary * 0.01;
    }


//    getters

    public String getName() {
        return name;
    }

    public String getNationalInsurance() {
        return nationalInsurance;
    }

    public Double getSalary() {
        return salary;
    }

//    setters

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public void setNationalInsurance(String nationalInsurance) {
        this.nationalInsurance = nationalInsurance;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
