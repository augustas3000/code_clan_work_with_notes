public class Bear {
//    not visible from outside classes by default
    private String name;
    private int age;
    private double weight;

    public Bear(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
//        this.gender = "f";
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean readyToHibernate() {
        if (this.weight >= 80.0) {
            return true;
        } else {
            return false;
        }
    }
}
