package com.traplord.arrays;

public class A3InsertingElementIntoArrayAtSpecificPosition2 {

    public static void main(String[] args) {



        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int pos=2;
        int size=5;
        int element=60;

        for (int i =size-1; i>pos; i--) {
            arr[i] = arr[i-1];
        }
        arr[pos] = element;

     for(int array: arr) {
            System.out.println("Array after inserting element at position " + pos + ":" + arr);
     }






    }
}
