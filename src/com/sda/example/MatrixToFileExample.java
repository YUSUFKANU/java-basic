package com.sda.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 */
public class MatrixToFileExample {
    public static void main(String[] args) {
        final String fileName = "ala_i_zwierzeta.txt";
        writeToFile(fileName);
        readFromFile(fileName);
    }

    static void writeToFile(String fileName) {
        String[] tab = new String[]{
                "Ala ma kota",
                "Ala ma kota i psa",
                "Ala nie ma kota ani psa",
                "Ala ma rybki"
        };
        PrintWriter fileToWrite = null;
        try {
            fileToWrite = new PrintWriter(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < tab.length; i++) {
            fileToWrite.println(tab[i]);
        }
        fileToWrite.close();
    }

    static void readFromFile(String fileName) {
        File file = new File(fileName);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Zawartość odczytana z pliku: ");
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}
