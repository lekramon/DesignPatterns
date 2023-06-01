package org.example.ExemploState;

public class Main {
    public static void main(String[] args) {
        ObjectWithState object = new ObjectWithState();

        object.doAction();

        object.setState(new StateB());

        object.doAction();
    }
}

