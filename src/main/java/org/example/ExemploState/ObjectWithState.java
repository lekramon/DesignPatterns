package org.example.ExemploState;

public class ObjectWithState {

    private State currentState;

    public ObjectWithState() {
        currentState = new StateA();
    }

    public void setState(State state) {
        currentState = state;
    }

    public void doAction() {
        currentState.doAction();
    }
}
