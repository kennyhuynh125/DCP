package dcp.problems;

import java.util.Arrays;

/**
 * 1.2 Locate smallest window to be sorted Given an array of integers that are
 * out of order, determine the bounds of the smallest window that must be sorted
 * in order for the entire array to be sorted. For example, given [3,7,5,6,9]
 * you should return (1,3).
 */

public class SmallestWindowSorted {

  /**
   * Sort the array then find when the element at the indices are different
   * Runtime: O(nlogn) <-- need to sort Space: O(nlogn)
   */
  public int[] naiveWindowSorted(int[] array) {
    if (array.length == 0) {
      int[] empty = { 0, 0 };
      return empty;
    }
    int[] originalArray = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      originalArray[i] = array[i];
    }
    Arrays.sort(array);
    int[] indices = new int[2];
    int start = 0;
    int end = 0;
    for (int i = 0; i < array.length; i++) {
      if (originalArray[i] != array[i]) {
        start = i;
        break;
      }
    }
    for (int i = array.length - 1; i >= 0; i--) {
      if (originalArray[i] != array[i]) {
        end = i;
        break;
      }
    }
    indices[0] = start;
    indices[1] = end;
    return indices;
  }

  /**
   * Keep track of current minimum and maximum seen so far. Two passes, one from
   * left and one from right Runtime: O(n) Space: O(1)
   */
  public int[] optimizedWindowSorted(int[] array) {
    int left = 0;
    int right = 0;
    int maxSeen = Integer.MIN_VALUE;
    int minSeen = Integer.MAX_VALUE;
    for (int i = 0; i < array.length; i++) {
      maxSeen = Math.max(maxSeen, array[i]);
      if (array[i] < maxSeen) {
        right = i;
      }
    }
    for (int i = array.length - 1; i >= 0; i--) {
      minSeen = Math.min(minSeen, array[i]);
      if (array[i] > minSeen) {
        left = i;
      }
    }
    int[] results = { left, right };
    return results;
  }
}