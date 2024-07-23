package com.traplord.matrix_multidemessional_array;

import java.util.Arrays;

public class M141DReversingArray {

 public static void main(String[] args) {


        int [] myArray={12,44,85,2467,678,};

        //before reversing the array, print the original array
     System.out.println("Original array is: " + Arrays.toString(myArray)  );


    //reversing the array using a simple for loop

    for(int i=0; i<myArray.length/2; i++){

        int temp=myArray[1];

        myArray[i]=myArray[myArray.length-1-i];

        myArray[myArray.length-1-i]=temp;


    }
     System.out.println("Reversed array is: " + Arrays.toString(myArray));










 }







}
