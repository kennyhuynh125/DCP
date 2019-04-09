package dcp.problems;

public class ProductOfArrayExceptSelf {
  /**
   * Problem 1.1 - Product of array except self Find the product of the given
   */

  /**
   * O(n^2) solution without division O(n) space
   */
  public int[] productOfArrayExceptSelf(int[] array) {
    if (array.length == 0) {
      return array;
    }
    int[] results = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      int product = 1;
      for (int j = 0; j < array.length; j++) {
        if (j == i) {
          continue;
        }
        product *= array[j];
      }
      results[i] = product;
    }
    return results;
  }

  /**
   * O(n) solution without division O(n) space
   */
  public int[] productOfArrayOptimized(int[] array) {
    if (array.length == 0) {
      return array;
    }
    int[] results = new int[array.length];
    for (int i = 0; i < results.length; i++) {
      results[i] = 1;
    }
    int product = 1;
    for (int i = 0; i < array.length; i++) {
      results[i] *= product;
      product *= array[i];
    }
    product = 1;
    for (int i = array.length - 1; i >= 0; i--) {
      results[i] *= product;
      product *= array[i];
    }
    return results;
  }
}