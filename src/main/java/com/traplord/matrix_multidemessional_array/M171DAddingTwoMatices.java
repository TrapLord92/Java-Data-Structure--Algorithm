package com.traplord.matrix_multidemessional_array;

import java.util.Scanner;

public class M171DAddingTwoMatices {

    public static void  main(String[] args) {

        //adding two matrices

//1Step Getting Variables from user
        int m,n,c,d;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        m = in.nextInt();
        System.out.println("Enter the number of columns ");
        n = in.nextInt();

int[][] firstMatrix = new int[m][n];
int [][] secondMatrix = new int[m][n];
int[][] sumMatrix = new int[m][n];

//filling the 1 matrix
        System.out.println("Enter the elements of first matrix ");
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                firstMatrix[c][d] = in.nextInt();
            }
        }

        //filling the 2 matrix
        System.out.println("Enter the elements of second matrix ");
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                secondMatrix[c][d] = in.nextInt();
            }
        }

        //adding the two matrices
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                sumMatrix[c][d] = firstMatrix[c][d] + secondMatrix[c][d];
            }
        }

        //printing the result
        System.out.println("Sum of the two matrices ");
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                System.out.print(sumMatrix[c][d] + "\t ");
            }
            System.out.println();
        }






    }













}
