package com.traplord.matrix_multidemessional_array;

import java.util.Random;

public class M191DShufflingAnArray {

    //cerated program to shuffle an array





    public static void shuffleArray(int[] arr) {
            for (int i = arr.length - 1; i > 0; i--) {
            Random random = new Random();
            int j = random.nextInt(i + 1);

            swapElements(arr, i, j);
        }

    }


    private static void swapElements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nShuffled array:");
        shuffleArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


}
