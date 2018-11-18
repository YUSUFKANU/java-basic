package com.sda.example.zajecia6.composition;

import com.sda.example.zajecia6.Employer;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class CompositionTest {
    public static void main(String[] args) {
        Employer employer = new Employer("Jan", "Kowalski", "XYZ");
        Employee employee = new Employee("Tomasz", "Nowak", employer, 4000);
        System.out.println("Dane pracodawcy: " + employee.getEmployer());
        System.out.println("Zarobki pracownika: " + employee.calcSalary());
        List<String> list = new ArrayList<>(100);
    }

}
