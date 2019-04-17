package dcp.problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

import dcp.problems.MaximumSubarraySum;

public class MaximumSubarraySumTest {
  MaximumSubarraySum obj = new MaximumSubarraySum();

  @Test
  @DisplayName("No Test")
  void testNoElements() {
    int[] input = new int[0];
    int expected = 0;
    int output = obj.naiveMaximumSubarraySum(input);
    assertEquals(expected, output);
  }

  @Test
  @DisplayName("All negative numbers")
  void testAllNegative() {
    int[] input = { -5, -4, -3, -2, -1 };
    int expected = 0;
    int output = obj.naiveMaximumSubarraySum(input);
    assertEquals(expected, output);
  }

  @Test
  @DisplayName("Negative and postiives")
  void testNegativeAndPositive() {
    int[] input = { 34, -50, 42, 14, -5, 86 };
    int expected = 137;
    int output = obj.naiveMaximumSubarraySum(input);
    assertEquals(expected, output);
  }

  @Test
  @DisplayName("No Test - optimized")
  void testNoElementsOptimized() {
    int[] input = new int[0];
    int expected = 0;
    int output = obj.optimizedMaximumSubarraySum(input);
    assertEquals(expected, output);
  }

  @Test
  @DisplayName("All negative numbers - optimized")
  void testAllNegativeOptimized() {
    int[] input = { -5, -4, -3, -2, -1 };
    int expected = 0;
    int output = obj.optimizedMaximumSubarraySum(input);
    assertEquals(expected, output);
  }

  @Test
  @DisplayName("Negative and postiives - optimized")
  void testNegativeAndPositiveOptimized() {
    int[] input = { 34, -50, 42, 14, -5, 86 };
    int expected = 137;
    int output = obj.optimizedMaximumSubarraySum(input);
    assertEquals(expected, output);
  }

  @Test
  @DisplayName("55 -50 -10 - optimized")
  void testOwnTestOptimized() {
    int[] input = { 55, -50, -10 };
    int expected = 55;
    int output = obj.optimizedMaximumSubarraySum(input);
    assertEquals(expected, output);
  }
}