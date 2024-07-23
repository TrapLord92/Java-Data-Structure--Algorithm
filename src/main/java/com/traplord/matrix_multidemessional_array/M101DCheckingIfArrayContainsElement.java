package com.traplord.matrix_multidemessional_array;

public class M101DCheckingIfArrayContainsElement {
    //write a program to check if an  array contains a specific value

    public static boolean containsElement(int[] arr,int item) {

        for (int n:arr) {
            if (n == item) {
                return true;
            }

        }
        return false;


    }

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5};

        System.out.println(containsElement(arr, 3)); // prints: true



    }



}
