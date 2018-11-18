package com.sda.example;

/**
 */
public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public double computeMonthlyCost() {
        double sum = 0;
        for (int i = 0; i < this.employees.length; i++) {
            sum = sum + this.employees[i].getSalary();
        }

        return sum;
    }

    public double computeAnnualCost() {
        return 12 * this.computeMonthlyCost();
    }

    public double computeDayilyCost() {
        return computeAnnualCost() / 365;
    }

    public double computeTimeUnitCost(TimeUnit timeUnit) {
        switch (timeUnit) {
            case DAY:
                return computeDayilyCost();
            case YEAR:
                return computeAnnualCost();
            case MONTH:
                return computeMonthlyCost();
                default:
                    throw new UnsupportedOperationException("Unsupported time unit!");
        }
    }
}
