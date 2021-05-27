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
        for (int i = 0; i < supervisedEmployees.size(); i++) {
            supervisedEmployees.get(i).printName(level);
        }
    }

    public void addEmployee(Employee employee){
        supervisedEmployees.add(employee);
    }

    public void fireEmployee(Employee employee){
        supervisedEmployees.remove(employee);
    }

    public List<Employee> getSupervisedEmployees() {
        return supervisedEmployees;
    }

    // TODO 3: Implement list() for Supervisor
}
