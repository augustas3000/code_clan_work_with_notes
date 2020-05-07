package Behaviours.ImplementationClasses;

import Behaviours.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
