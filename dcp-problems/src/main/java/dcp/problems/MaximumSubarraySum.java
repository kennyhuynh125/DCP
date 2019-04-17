package dcp.problems;

public class MaximumSubarraySum {
  /**
   * Given an array of numbers find the maximum sum of any contiguous subarray of
   * the array. For example, given the array [34, -50, 42, 14, -5, 86] the maximum
   * sum would be 137, since we would take elements 42, 14, -5, and 86. Given the
   * array [-5, -1, -8, -9], the maximum sum would be 0, since we would choose not
   * to take any elements.
   */

  /**
   * Nested for loop going through each element and adding next elements and
   * getting max Runtime: O(n^2) Space: O(1)
   */
  public int naiveMaximumSubarraySum(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      int currentSum = 0;
      for (int j = i; j < array.length; j++) {
        currentSum += array[j];
        sum = Math.max(sum, currentSum);
      }
    }
    return sum;
  }

  /**
   * keep track of current sum and whenever it reaches negative, set it to 0, else
   * keep adding set new sum to be max of sum / current sum Runtime: O(n) Space:
   * O(1)
   */
  public int optimizedMaximumSubarraySum(int[] array) {
    int sum = 0;
    int currentSum = 0;
    for (int i = 0; i < array.length; i++) {
      if (currentSum + array[i] < 0) {
        currentSum = 0;
      } else {
        currentSum += array[i];
      }
      sum = Math.max(sum, currentSum);
    }
    return sum;
  }
}