import Behaviours.FlyBehaviour;
import Behaviours.QuackBehaviour;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {
//
    }

    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }


    public abstract void display();

    public void performFly() {
//        delegate to behaviour class
        flyBehaviour.fly();
    }

//    public void performFly(int times) {
////        delegate to behaviour class
//        flyBehaviour.fly(3);
//    }


    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {

        System.out.println("All ducks float, even decoys!!!");
    }

}
