package com.sda.example;

/**
 */
public class Excercise5 {
    public static void main(String[] args){
        int i = 0;
        while (i <= 100){
            System.out.print(i);
            if (i%2 ==0) {
                System.out.print(", podzielne przez 2 ");
            }
            if ( i % 3 == 0) {
                System.out.print(", podzielne przez 3 ");
            }
            if (i % 5 == 0) {
                System.out.print(", podzielne przez 5 ");
            }
            System.out.println("");
            i++;
        }
    }
}
