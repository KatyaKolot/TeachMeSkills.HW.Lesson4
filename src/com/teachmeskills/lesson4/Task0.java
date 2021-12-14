package com.teachmeskills.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        int[][][] myArray = {{{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  which element of the array will increase: ");
        int n = sc.nextInt();
        for (int[][] array1 : myArray) {
            for (int[] array2 : array1) {
                for (int item : array2) {
                    item += n;
                    System.out.print(item + " ");


                }
            }
        }
    }
}