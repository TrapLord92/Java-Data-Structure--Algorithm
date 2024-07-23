package com.traplord.matrix_multidemessional_array;
import java.util.Arrays;

public class M121DFindingTheMaxandMinInarray {





public static void main(String[] args) {


    //write a program to find the max and min in array integer

    //Step 1 creating Variables

    int [] myArray={
            12,44,85,2467,678,34,123,1,99
    };

    int max=myArray[0];
    int min=myArray[0];

    //Step 2 Finding the max and min (by comparing each element with the current max and min)


    for (int a:myArray){//start always with looping through each element in the array, then do the logical max and min update.

        if (a<min){
            min=a;
        }
        if (a>max){
            max=a;
        }


    }

    System.out.println("The maximum number in the array is: " + max);
    System.out.println("The minimum number in the array is: " + min);










}
















}
