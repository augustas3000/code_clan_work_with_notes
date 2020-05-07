package Components;//abstract as this class will never be instantiated

public abstract class Component {

    //    Declare instance variables:
    private String name;
    private String make;
    private String model;

    //    instantiate instance variables
    public Component(String name, String make, String model) {
        this.name = name;
        this.make = make;
        this.model = model;
    }

//    getters

    public String getName() {
        return name;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

//    setters

    public void setName(String name) {
        this.name = name;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
