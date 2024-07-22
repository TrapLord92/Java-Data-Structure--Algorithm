package com.traplord.matrix_multidemessional_array;

import java.util.Arrays;



//There are no algorithm to remove completely element from a matrix in Java.
//But we can replace the element with Integer.MIN_VALUE to mark it as deleted.

public class M82DDeletingElementFromMatrix {
    public static void deleteElement(int row, int col,int arr[][]) {
        //checking if the index is out of bounds

        try {
            System.out.println("Delete Sucessfully!");
            //replace the element with Integer.MIN_VALUE to mark it as deleted.
            arr[row][col] =Integer.MIN_VALUE;
            System.out.println(Arrays.deepToString(arr)  );
        } catch (ArrayIndexOutOfBoundsException e){
        System.out.println("This index is out of bounds. Please enter valid row " +
                "and column index.");}


    }




    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16} };
        int row = 2;
        int col = 2;
        System.out.println("Original Matrix:");
        //deleting element from matrix

       deleteElement(row, col, arr);









    }








}
