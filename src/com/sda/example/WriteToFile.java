package com.sda.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 */
public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test_file.txt");
        Scanner scanner = new Scanner(file);
        String singleLine;
        while (scanner.hasNext()) {
            singleLine = scanner.nextLine();
            System.out.println(singleLine);
        }
    }
}
