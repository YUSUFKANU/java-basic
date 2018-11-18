package com.sda.example;

/**
 */
public class CompanyCostTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jan", "Kowalski", 4000);
        Employee employee2 = new Employee("Tomasz", "Nowak", 3980);
        Employee employee3 = new Employee("Halina", "Nowak", 3999);

        Company company = new Company(new Employee[]{employee1, employee2, employee3});
        System.out.println("Company monthly cost is: " + company.computeMonthlyCost() + " PLN");
        System.out.println("Company yearly cost is: " + company.computeAnnualCost() + " PLN");
        TimeUnit timeUnit = TimeUnit.YEAR;
        for (int i = 0; i < TimeUnit.values().length; i++) {
            System.out.println(TimeUnit.values()[i]);
        }
        System.out.println("Company cost for time unit: " + timeUnit
                + " is: " + company.computeTimeUnitCost(timeUnit));
    }
}
