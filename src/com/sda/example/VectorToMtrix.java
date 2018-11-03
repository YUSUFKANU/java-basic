package com.sda.example;

/**
 */
public class VectorToMtrix {

    public static void main(String[] args) {
        int[] tab1 = new int[]{0,1,2,3,4,5};
        int n1 = 2;
        int n2 = 3;
        int[][] tab2 = new int[n1][n2];

        int k = 0;

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                tab2[i][j] = tab1[k];
                ++k;
                System.out.print("tab2[" + i + "," + j + "]=" + tab2[i][j] + ", ");
            }
            System.out.println("");
        }
    }
}
