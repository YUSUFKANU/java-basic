package com.sda.example.zajecia6;

/**
 */
public class Employer extends Person implements Iemployer {
    private String companyName;
    public Employer(String name, String surname, String companyName) {
        super(name, surname);
        this.companyName = companyName;
    }

    @Override
    public String getCompany() {
        return this.companyName;
    }

    public void printCompanyName() {
        System.out.println(companyName);
    }

    @Override
    public String toString() {
        return "Employer{" +
                "companyName='" + companyName + '\'' +
                "firstName='" + getFirstName() + '\'' +
                "lastName='" + getLastName() + '\'' +
                '}';
    }
}
