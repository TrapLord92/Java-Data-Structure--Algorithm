package com.traplord.arrays;

public class A7RemoveDuplicateFromArray {



    static int RemoveDuplicates(int arr[], int n) {

        if (n==0||n==1){
            return n;
        }

        int len=0;
        int i;

        for (i=0; i<n-1; i++){
            if (arr[i]!=arr[i+1]){
                arr[len++] = arr[i];
            }

        }
         arr[len++] = arr[n-1];
                return len;


    }

public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 9, 9};
        int n = arr.length;
        int len=0;
        len = RemoveDuplicates(arr, n);
        //printing array elements
    System.out.println("Array after removing duplicates: ");
        for (int i=0; i<len; ++i)
            System.out.print(arr[i]+" ");
    }


}













