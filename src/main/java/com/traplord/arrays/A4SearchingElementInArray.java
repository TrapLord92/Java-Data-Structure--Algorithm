package com.traplord.arrays;

public class A4SearchingElementInArray {

    static int searchElement(int[] arr, int size,int key) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        int size = arr.length;
        int key = 30;

        int index = searchElement(arr, size, key);

        if (index == -1) {
            System.out.println("Element not found in the array");
        }else {
            System.out.println("Element found at index: " + index);
        }

    }


}
