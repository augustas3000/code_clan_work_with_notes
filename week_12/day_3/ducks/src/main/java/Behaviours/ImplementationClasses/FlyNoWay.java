package Behaviours.ImplementationClasses;

import Behaviours.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    //flying behaviour implementation for ducks that cant fly
    public void fly() {
        System.out.println("I can't fly!");
    }

    public void fly(int times) {
        System.out.println("I will try to fly " + times + " times without wings");
    }

}
