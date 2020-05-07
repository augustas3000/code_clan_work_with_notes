package Behaviours.ImplementationClasses;

import Behaviours.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

    public void fly() {
        System.out.println("Im flying!");
    }

    public void fly(int times) {
        System.out.println("I will try to fly " + times + " times with wings");
    }

}
