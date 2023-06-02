package org.example.ExemploFacade.Exemplo1;

import org.example.ExemploFacade.Exemplo1.facade.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        computer.shutdown();
    }
}
