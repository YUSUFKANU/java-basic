package com.sda.example;

/**
 */
public class SwitchExample {
    public static void main(String[] args) {
        int variable = 1;

        switch (variable) {
            case 1:
                System.out.println("Case 1");
                variable = 12;
            case 2:
                System.out.println(variable);
                break;

                default:
                    System.out.println("Varaible other than 1 and 2");
                    break;
        }
    }
}
