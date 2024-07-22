package com.traplord.matrix_multidemessional_array;

public class M72DSearchingArray {
    public static void searchElement(int value , int[][] array){

        for (int row=0;row<array.length;row++){
            for ( int col=0;col<array[row].length;col++){
                if(array[row][col]==value){
                    System.out.println("Element found at position ("+row+","+col+")");
                    return;
                }
            }

        }

    }
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16} };
        int value = 15;
        searchElement(value, arr);
        // Output: Element found at position (2, 1)







    }








}
