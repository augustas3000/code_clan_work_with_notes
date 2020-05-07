public class Motorbike extends Vehicle {

    public Motorbike(String model)
    {
        super(model, 2);
    }

    public String drivingInstructions()
    {
        return super.drivingInstructions() + " Use handlebars to steer.";

    }

    public String boardingInstructions() {
        return "Enter via one of the 4 doors";
    }


}