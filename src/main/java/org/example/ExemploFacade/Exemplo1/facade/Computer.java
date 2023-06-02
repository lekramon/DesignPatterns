package org.example.ExemploFacade.Exemplo1.facade;

import org.example.ExemploFacade.Exemplo1.Cpu;
import org.example.ExemploFacade.Exemplo1.Disk;
import org.example.ExemploFacade.Exemplo1.Memory;

public class Computer {
    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void start() {
        cpu.check();
        memory.load();
        disk.mount();
        cpu.execute();
    }

    public void shutdown() {
        cpu.stop();
        disk.unmount();
        memory.flush();
        System.out.println("Computer shutdown complete.");
    }
}
