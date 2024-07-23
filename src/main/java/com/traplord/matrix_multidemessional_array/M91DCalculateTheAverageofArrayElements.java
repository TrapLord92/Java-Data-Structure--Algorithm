package com.traplord.matrix_multidemessional_array;


//Calculating the avarage of array elements

public class M91DCalculateTheAverageofArrayElements {





    public static void main(String[] args) {
//1Step calculate the sum of all elements in the array

        int [] numbers=new int[]{1,2,3,4,5};

        int sum=0;

        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];

        }
        //2Step calculate the average of the sum

        double average=(double)sum/numbers.length;

        System.out.println("The average of the array elements is: "+average);   //3Step print the average











    }








}
