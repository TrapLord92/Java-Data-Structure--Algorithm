package com.traplord.matrix_multidemessional_array;

public class M3Printing2DArrayElements {

    public static void main(String[] args) {


              int[][] arr={
                {1},
                {1, 2,3 },
                {4, 5, 6,7},
                {7, 8, 9,10,11}


        };
              //To iterarte into multidimensional array need nested loop.
              for (int i=0; i<arr.length; i++){
                  for (int j=0; j<arr[i].length; j++){
                      System.out.print(arr[i][j]+" ");
                  }
                  System.out.println(); // for new line after each row.
              }


              //Interating over array using forEach loop.
        System.out.println("Using forEach loop");

                for (int[] row : arr) {
                    for (int value : row) {
                        System.out.print(value + " ");
                    }
                    System.out.println(); // for new line after each row.
                }



                //Using index-based for loop.

        System.out.println("Using index-based for loop"  );

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(); // for new line after each row.
        }










    }













}
