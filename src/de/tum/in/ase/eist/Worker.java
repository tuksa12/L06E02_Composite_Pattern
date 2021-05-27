package de.tum.in.ase.eist;

// TODO 2: Implement the Worker class
public class Worker extends Employee {

    public Worker(String name) {
        super(name);
    }

    @Override
    public void list(int level) {
        printName(level);
    }

    // TODO 3: Implement list() for Worker
}
