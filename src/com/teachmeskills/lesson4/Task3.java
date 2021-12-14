package com.teachmeskills.lesson4;

public class Task3 {
    public static void main(String[] args) {

        int[][] myArray = {{3, 1, 7, 5,}, {7, 9, 3, 5}};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++)
                sum = myArray[i][j] + sum;
        }

            System.out.println(sum);

    }
}
