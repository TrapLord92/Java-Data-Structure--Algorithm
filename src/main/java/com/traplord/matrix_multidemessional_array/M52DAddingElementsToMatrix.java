package com.traplord.matrix_multidemessional_array;

import java.util.Arrays;
import java.util.Scanner;

public class M52DAddingElementsToMatrix {

    public static void main(String[] args) {

        int [][] matrix = new int[2][4];

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter elements of the first matrix: ");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 4; j++) {
                matrix[i][j] = s1.nextInt();
            }

            System.out.println();
        }
         System.out.println(Arrays.deepToString(matrix));












    }







}
