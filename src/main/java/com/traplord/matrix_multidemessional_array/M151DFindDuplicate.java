package com.traplord.matrix_multidemessional_array;

public class M151DFindDuplicate {

    public static void  main(String[] args){

        //Finding duplicates in array


        int [] myArray={12,34,34,56,45,77,78,99,990,99,78};


//        finding the duplicates using loop


        for (int i=0; i<myArray.length-1; i++){
            for (int j=i+1; j<myArray.length; j++){

                if(myArray[i]==myArray[j] && myArray[i]!=j  ){
                    System.out.println("Duplicate found: "+myArray[i]);
                }
            }


        }







    }








}
