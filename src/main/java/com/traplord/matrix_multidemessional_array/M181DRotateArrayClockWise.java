package com.traplord.matrix_multidemessional_array;

public class M181DRotateArrayClockWise {
    //rotate array clockwise by one position

    public static void rotateArray(int[] arr) {
        int a=arr[arr.length-1];

        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = a;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original Array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }

        rotateArray(arr);
//           rotateArray(arr);
//              rotateArray(arr);
//              rotateArray(arr);
//           rotateArray(arr);
//              rotateArray(arr);

        System.out.println("\nArray Rotated Clockwise:");
        for(int num : arr) {
            System.out.print(num + " ");
        }

    }





}
