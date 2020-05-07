public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String model, int numberOfDoors)
    {
//        send to parent class and assign
        super(model, 4);
        this.numberOfDoors = numberOfDoors;
    }


//    public String drivingInstructions() {
//        return "Put a brick in the accelerator";
//    }

    public String drivingInstructions()
    {
        return super.drivingInstructions() + " Use steering wheel to steer.";

    }

    public String openDoors()
    {
        return ("Beep. "+ numberOfDoors +" doors opened.");
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String boardingInstructions() {
        return "Enter via one of the 4 doors";
    }
}