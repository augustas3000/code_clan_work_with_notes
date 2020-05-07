public class Instructor extends Person {

//    instance vars
    private String moduleTeam;


    public Instructor(String name, String cohort, String moduleTeam) {
//        inherits instance variables of superclass Person
        super(name, cohort);
        this.moduleTeam = moduleTeam;
    }

}