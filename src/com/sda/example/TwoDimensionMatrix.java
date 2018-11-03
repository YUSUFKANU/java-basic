package com.sda.example;

/**
 */
public class TwoDimensionMatrix {
    public static void main(String[] args) {
        int[][] tab = new int[5][5];
        for (int i = 0; i < tab.length; i++) {
            tab[2][i] = 1;
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
