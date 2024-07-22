package com.traplord.arrays;

public class A6RotateElementbykPosition {

 static void rotateArrayt(int[] arr,int d,int n) {
     //storing version of the current index
     int temp[]=new int[n];
     //keeping track of the current index in the original array
     int k=0;
     //storing elements n-d elements of the array to the front temp[]

     for(int i=d;i<n;i++){
         temp[k]=arr[i];
         k++;
     }
     //storring the first d elements of the array,into temp

     for (int i=0;i<d;i++){
         temp[k]=arr[i];
         k++;
     }

     //copy elements temp[] in array
     //to get the final rotated array
     for (int i=0;i<n;i++){
         arr[i]=temp[i];}







 }



 static void printArray(int arr[],int n) {

     for (int i = 0; i < n; i++){
         System.out.println("After rotation the array are : " + arr[i] + " ");



     }

     System.out.println();


 }



    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        int n = arr.length;
        int k = 3;

        System.out.println("Original array is : ");
        for (int array: arr){
            System.out.print(array + " ");
        }
        System.out.println();
        System.out.println("After Rotating array by " + k + " positions");
        rotateArrayt(arr, k, n);
          printArray(arr, n);
        }




    }



