public class Person {

//    inst vars
//    private wont prevent inheritence of inst variables
    private String name;
    private String cohort;

//    constructor
    public Person(String name, String cohort) {
        this.name = name;
        this.cohort = cohort;
    }

//    methods
    public String talk(String language) {
        return  "I love " + language + "!";
    }


//    getters
    public String getName() {
        return name;
    }

    public String getCohort() {
        return cohort;
    }

//    setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }

}
