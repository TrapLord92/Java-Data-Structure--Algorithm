package com.traplord.matrix_multidemessional_array;

public class M43DArrays {
   public static void main(String[] args) {
       int[][][] arr3D = new int[2][3][4];
       arr3D[0][0][0] = 1;
       arr3D[0][0][1] = 2;
       arr3D[0][0][2] = 3;
       arr3D[0][0][3] = 4;
       arr3D[0][1][0] = 5;
       arr3D[0][1][1] = 6;
       arr3D[0][1][2] = 7;
       arr3D[0][1][3] = 8;
       arr3D[1][0][0] = 9;
       arr3D[1][0][1] = 10;
       arr3D[1][0][2] = 11;
       arr3D[1][0][3] = 12;
       arr3D[1][1][0] = 13;
       arr3D[1][1][1] = 14;
       arr3D[1][1][2] = 15;
       arr3D[1][1][3] = 16;

     //looping through 3D array
       for(int i = 0; i < 2; i++) {
           for(int j = 0; j < 3; j++) {
               for(int k = 0; k < 4; k++) {
                   System.out.print(arr3D[i][j][k] + " ");
               }
               System.out.println();
           }
           System.out.println("-------------------");
       }


   }
}
