package org.example.ExemploFacade;

import org.example.ExemploFacade.facade.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        computer.shutdown();
    }
}
