package com.tasks.arrays;

/*
Given a sorted array nums, remove the duplicates in-place such that each element
appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input
array in-place with O(1) extra memory.
*/

public class RemoveDuplicates {

  public static void main(String[] args) {
    int[] arr = {0, 0, 0, 1, 2, 2, 3, 3, 4, 5, 5};
    int uniqLength = 0;

    for(int i = 1; i < arr.length; i++) {
      if (arr[uniqLength] != arr[i]) {
        uniqLength++;
        arr[uniqLength] = arr[i];
      }
    }
    uniqLength++;
    System.out.println(uniqLength);
  }
}
