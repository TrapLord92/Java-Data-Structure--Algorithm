package com.traplord.arrays;

public class A2AccessingArray {

    public static void main(String[] args) {

        int[] arr = {10,7,78,30,16};

        // Accessing first and last elements of the array
        //ACCESSING SINGLE ELEMENTS

        System.out.println("First element: " + arr[0]);
        System.out.println("Last element: " + arr[arr.length - 1]);

//        ACCESSING MULTIPLE ELEMENTS WITH FOR LOOP


        for(int i=0; i<arr.length; i++){
            System.out.println("Array "+ arr[i] +" lives in this memory adrress ->" +arr);//prints memory location of the array elements
          System.out.println(arr[i]);//displays all elements in the array
        System.out.println(i + " element: " + arr[i]); //displays index and value of each element in the array
     }


    }
}
