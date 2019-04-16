package dcp.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

import dcp.problems.SmallestWindowSorted;

public class SmallestWindowSortedTest {
  SmallestWindowSorted obj = new SmallestWindowSorted();

  @Test
  @DisplayName("Array has no elements")
  void testNoElements() {
    int[] input = {};
    int[] expected = { 0, 0 };
    int[] output = obj.naiveWindowSorted(input);
    assertArrayEquals(expected, output);
  }

  @Test
  @DisplayName("Test array not sorted")
  void testNotSorted() {
    int[] input = { 3, 7, 5, 6, 9 };
    int[] expected = { 1, 3 };
    int[] output = obj.naiveWindowSorted(input);
    assertArrayEquals(expected, output);
  }

  @Test
  @DisplayName("Test array already sorted")
  void testAlreadySorted() {
    int[] input = { 1, 2, 3, 4, 5 };
    int[] expected = { 0, 0 };
    int[] output = obj.naiveWindowSorted(input);
    assertArrayEquals(expected, output);
  }

  @Test
  @DisplayName("Test array reverse sorted")
  void testReverseSorted() {
    int[] input = { 5, 4, 3, 2, 1 };
    int[] expected = { 0, 4 };
    int[] output = obj.naiveWindowSorted(input);
    assertArrayEquals(expected, output);
  }

  @Test
  @DisplayName("Array has no elements - optimized")
  void testNoElementsOptimized() {
    int[] input = {};
    int[] expected = { 0, 0 };
    int[] output = obj.optimizedWindowSorted(input);
    assertArrayEquals(expected, output);
  }

  @Test
  @DisplayName("Test array not sorted - optimized")
  void testNotSortedOptimized() {
    int[] input = { 3, 7, 5, 6, 9 };
    int[] expected = { 1, 3 };
    int[] output = obj.optimizedWindowSorted(input);
    assertArrayEquals(expected, output);
  }

  @Test
  @DisplayName("Test array already sorted - optimized")
  void testAlreadySortedOptimized() {
    int[] input = { 1, 2, 3, 4, 5 };
    int[] expected = { 0, 0 };
    int[] output = obj.optimizedWindowSorted(input);
    assertArrayEquals(expected, output);
  }

  @Test
  @DisplayName("Test array reverse sorted - optimized")
  void testReverseSortedOptimized() {
    int[] input = { 5, 4, 3, 2, 1 };
    int[] expected = { 0, 4 };
    int[] output = obj.optimizedWindowSorted(input);
    assertArrayEquals(expected, output);
  }
}