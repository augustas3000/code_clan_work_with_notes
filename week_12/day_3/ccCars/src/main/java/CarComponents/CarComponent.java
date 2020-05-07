package CarComponents;

public abstract class CarComponent {

    String name;
    String model;

     public CarComponent(String name, String model) {
         this.name = name;
         this.model = model;
     }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
