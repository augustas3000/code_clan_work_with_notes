import Behaviours.ImplementationClasses.FlyNoWay;
import Behaviours.ImplementationClasses.FlyWithWings;
import Behaviours.ImplementationClasses.Quack;
import Behaviours.ImplementationClasses.Squeak;

public class ModelDuck extends Duck {


    public ModelDuck() {
//        ModelDuck inherits the quackBehaviour and flyBehaviour instance variables from class Duck:
//        it uses the Quack() class to hhandle its quack, so when performQuack() is called, the resppnsibility
//        is delegated to the quack object and we get a real quack;
//        same with fly behaviour;
        flyBehaviour = new FlyWithWings();

        quackBehaviour = new Squeak();

    }

    public void display() {
        System.out.println("Ima model duck");
    }

}
