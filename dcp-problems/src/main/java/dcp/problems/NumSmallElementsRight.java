package dcp.problems;

import java.utils.ArrayList;

public class NumSmallElementsRight {
  /**
   * Given an array of integers, return a new array where each element in the new
   * array is the number of smaller elements to the right of that element in the
   * original input array. For example, given the array [3, 4, 9, 6, 1] return [1,
   * 1, 2, 1, 0] since: There is 1 smaller element to the right of 3 There is 1
   * smaller element to the right of 4 There are 2 smaller elements to the right
   * of 9 There is 1 smaller element to the right of 6 There are no smaller
   * elements to the right of 1
   */

  /**
   * Nested for loop and look only at right elements Runtime: O(n^2) Space: O(n)
   */
  public int[] naiveNumSmallElementsRight(int[] array) {
    int[] results = new int[array.length];
    if (array.length == 0) {
      return array;
    }
    for (int i = 0; i < array.length - 1; i++) {
      int smaller = 0;
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] > array[j]) {
          smaller++;
        }
      }
      results[i] = smaller;
    }
    results[array.length - 1] = 0;
    return results;
  }

  // [ 3, 4, 9, 6, 1]
  public int[] optimizedNumSmallElementsRight(int[] array) {
    int[] results = new int[array.length];
    if (array.length == 0) {
      return array;
    }
    results[array.length - 1] = 0;
    int min = array[array.length - 1];
    int max = array[array.length - 1];
    int minSum = 0;
    for (int i = array.length - 2; i >= 0; i--) {
      int num = 0;
      if (array[i] > max) {
        results[i] = array.length - 1 - i;
      } else if (array[i] > array[i + 1]) {
        results[i] += results[i + 1] + 1;
      } else if (array[i] > min) {
        minSum++;
        results[i] = minSum;
      } else {
        results[i] = num;
      }
      min = Math.min(min, array[i]);
      max = Math.max(max, array[i]);
    }
    return results;
  }
}
