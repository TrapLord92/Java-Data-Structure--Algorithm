package com.traplord.matrix_multidemessional_array;
import java.util.Arrays;

public class M111DRemovingElementFromarray {





    public static void main(String[] args) {

//removing an element from an array

        int [] myarr = {1, 2, 3, 4, 5,7,9,10};

        System.out.println("Original array before shifting:" +Arrays.toString(myarr));
       int removeIndex=4;

       for (int i=removeIndex; i < myarr.length-1; i++) {
           // move each element one position to the left
           //We are not deleting the element, it's just shifted to the left, effectively removing it'
           //because the length of the array is reduced by 1 and the last element (myarr[myarr.length-1]) is not used it automatically removes it
           myarr[i] = myarr[i+1]; // shift all elements to the left
           // myarr[i+1] = 0; // this line is optional, it can be used to set the removed element to

       }
         //array after shifting: " + Arrays.toString(myarr));
           System.out.println("New array after shifting "+ " the number "+ removeIndex+ " It is =" + Arrays.toString(myarr));











    }








}
