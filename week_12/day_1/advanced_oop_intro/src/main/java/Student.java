public class Student extends Person {

//constructor

    public Student(String name, String cohort) {
        super(name, cohort);
    }

    @Override
    public String talk(String language) {
        return "I fokken love " + language;
    }

}
