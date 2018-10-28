package com.sda.example;

import java.util.Scanner;

/**
 */
public class ForLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; i >= 0; --i) {
            System.out.println("Bomba wybuchnie za: " + i + " sekund!");
        }
    }
}
