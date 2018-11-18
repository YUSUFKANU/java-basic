package com.sda.example.zajecia6.composition;

import com.sda.example.zajecia6.Employer;
import com.sda.example.zajecia6.Person;

/**
 */
public class Employee extends Person implements IEmployee {
    private Employer employer;
    private double salary;

    public Employee(String name, String surname, Employer employer, double salary) {
        super(name, surname);
        this.employer = employer;
        this.salary = salary;
    }

    @Override
    public Employer getEmployer() {
        return this.employer;
    }

    @Override
    public double calcSalary() {
        return this.salary;
    }
}
