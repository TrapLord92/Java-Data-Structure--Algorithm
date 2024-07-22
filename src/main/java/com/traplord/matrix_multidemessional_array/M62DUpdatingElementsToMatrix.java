package com.traplord.matrix_multidemessional_array;

import java.util.Arrays;
import java.util.Scanner;

public class M62DUpdatingElementsToMatrix {

    public static void main(String[] args) {

        int [][] matrix = new int[2][4];
        matrix= new int[][]{{1, 2, 3, 4},
                {5, 6,7,8}};


        System.out.println("Original Matrix: " + Arrays.deepToString(matrix));


        matrix [1][2]= 10;
        System.out.println("Updated Matrix: " + Arrays.deepToString(matrix));











    }







}
