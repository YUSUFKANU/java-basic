package com.sda.example.zajecia6.composition;

import com.sda.example.zajecia6.Employer;

/**
 */
public interface IEmployee {
    Employer getEmployer();
    double calcSalary();
}
