package com.traplord.arrays;

public class A5RemovingElement {

  static int removeElement(int[] arr, int size, int index) {

      for (int i = index; i < size - 1; i++) {
          arr[i] = arr[i + 1];
          size--;
      }
      return size;
  }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        int size = arr.length;
        int index = 2;
        int newSize = removeElement(arr, size, index);
        System.out.println("Array after removing element at index " + index + ":"+ newSize);
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }

    }


}
