package com.traplord.arrays;

public class A3InsertingElementIntoArrayAtSpecificPosition {

    public static void main(String[] args) {

        int[] arr = {10,7,78,30,16,7};

        int position = 2;
        int size=5;
        int element = 45;

        for (int i=size; i >= position; i--){
            arr[i] = arr[i-1];//shifting elements to the right
        }
        arr[position] = element;//inserting the new element at the specified position
        for (int arr1 : arr) {
            System.out.println(arr1);
        }



    }
}
