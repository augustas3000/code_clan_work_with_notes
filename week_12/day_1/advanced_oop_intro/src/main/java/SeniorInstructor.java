//cant extend multiple classes;
public class SeniorInstructor extends Instructor {

//    inst var
    private String hiringTeam;

//    constructor
    public SeniorInstructor(String name, String cohort, String moduleTeam, String hiringTeam) {
        super(name, cohort, moduleTeam);
        this.hiringTeam = hiringTeam;
    }

//    returning/accessing inherited vars;
    public String doubleName() {
        return this.getName();
    }

}
