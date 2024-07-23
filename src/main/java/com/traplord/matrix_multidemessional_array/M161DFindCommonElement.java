package com.traplord.matrix_multidemessional_array;

public class M161DFindCommonElement {

    public static void  main(String[] args){

        //Finding common elements in two arrays


        int [] myArray={12,34,34,56,45,77,78,99,990,99,78};
        int [] otherArray={12,34,77,99,990,67,89,99};

        System.out.println("Common elements are: " + findCommonElements(myArray, otherArray));








    }

    private static String findCommonElements(int[] myArray, int[] otherArray) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < otherArray.length; j++) {
                if (myArray[i] == otherArray[j]) {
                    sb.append(myArray[i]).append(" ");
                    break;
                }
            }
        }

        return sb.toString().trim();
    }


}
