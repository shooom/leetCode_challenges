package com.tasks.arrays;

import java.util.Arrays;

public class RotateArray {

  public static void main(String[] args) {
    int k = 3;
    int[] nums = {1, 2, 3, 4, 5, 6, 7};

    for (int i = 0; i < k; i++) {
      int tmp = nums[nums.length - 1];

      for (int j = nums.length - 2; j >= 0; j--) {
        nums[j + 1] = nums[j];
      }
      nums[0] = tmp;
    }
  }
}
