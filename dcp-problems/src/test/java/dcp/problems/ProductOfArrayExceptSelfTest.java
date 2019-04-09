package dcp.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

import dcp.problems.ProductOfArrayExceptSelf;

public class ProductOfArrayExceptSelfTest {
  ProductOfArrayExceptSelf productArray = new ProductOfArrayExceptSelf();

  @Test
  @DisplayName("Array has more than 1 element")
  void testMoreThanOneElement() {
    int[] input = { 1, 2, 3, 4, 5 };
    int[] expected = { 120, 60, 40, 30, 24 };
    int[] output = productArray.productOfArrayExceptSelf(input);
    assertArrayEquals(expected, output);
  }

  @Test
  @DisplayName("Array has only one element")
  void testOnlyOneElement() {
    int[] input = { 1 };
    int[] expected = { 1 };
    int[] output = productArray.productOfArrayExceptSelf(input);
    assertArrayEquals(expected, output);
  }

  @Test
  @DisplayName("Array has no elements")
  void testNoElements() {
    int[] input = {};
    int[] expected = {};
    int[] output = productArray.productOfArrayExceptSelf(input);
    assertArrayEquals(expected, output);
  }

  @Test
  @DisplayName("Array contains zero")
  void testContainsZero() {
    int[] input = { 1, 2, 3, 0 };
    int[] expected = { 0, 0, 0, 6 };
    int[] output = productArray.productOfArrayExceptSelf(input);
    assertArrayEquals(expected, output);
  }

  @Test
  @DisplayName("Optimized - Array has more than one element")
  void optimizedTestOnlyOneElement() {
    int[] input = { 1, 2, 3, 4, 5 };
    int[] expected = { 120, 60, 40, 30, 24 };
    int[] output = productArray.productOfArrayOptimized(input);
    for (int i : output) {
      System.out.println(i);
    }
    assertArrayEquals(expected, output);
  }
}