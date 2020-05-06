package com.tasks.strings;

/**
 * Write a function that reverses a string. The input string is given as an array of characters
 * char[].
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array
 * in-place with O(1) extra memory.
 *
 * You may assume all the characters consist of printable ascii characters.
 */
public class ReverseString {

  public static void main(String[] args) {
    String s = "Reverse String";
    reverseString(s.toCharArray());
  }

  public static void reverseString(char[] s) {
    for (int i = 0; i < s.length / 2; i++) {
      char t = s[i];
      s[i] = s[(s.length - 1) - i];
      s[(s.length - 1) - i] = t;
    }
  }
}
