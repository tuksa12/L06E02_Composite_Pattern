package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.List;

// TODO 1: Implement the Supervisor class
public class Supervisor extends Employee{
    private List<Employee> supervisedEmployees;

    public Supervisor(String name) {
        super(name);
        supervisedEmployees = new ArrayList<>();
    }

    @Override
    public void list(int level) {
        printName(level);
        printName(level + 1);
    }

    public void addEmployee(Employee employee){
        supervisedEmployees.add(employee);
    }

    public void fireEmployee(Employee employee){
        supervisedEmployees.remove(employee);
    }

    // TODO 3: Implement list() for Supervisor
}
