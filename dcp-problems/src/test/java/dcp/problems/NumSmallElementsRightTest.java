package dcp.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

import dcp.problems.NumSmallElementsRight;

public class NumSmallElementsRightTest {
  NumSmallElementsRight obj = new NumSmallElementsRight();

  @Test
  @DisplayName("No elements")
  void noElements() {
    int[] input = {};
    int[] expected = {};
    int[] output = obj.naiveNumSmallElementsRight(input);
    int[] outputOptimized = obj.optimizedNumSmallElementsRight(input);
    assertArrayEquals(expected, output);
    assertArrayEquals(expected, outputOptimized);
  }

  @Test
  @DisplayName("One element")
  void oneElement() {
    int[] input = { 5 };
    int[] expected = { 0 };
    int[] output = obj.naiveNumSmallElementsRight(input);
    int[] outputOptimized = obj.optimizedNumSmallElementsRight(input);
    assertArrayEquals(expected, output);
    assertArrayEquals(expected, outputOptimized);
  }

  @Test
  @DisplayName("Sorted order")
  void sortedOrder() {
    int[] input = { 1, 2, 3, 4, 5 };
    int[] expected = { 0, 0, 0, 0, 0 };
    int[] output = obj.naiveNumSmallElementsRight(input);
    int[] outputOptimized = obj.optimizedNumSmallElementsRight(input);
    assertArrayEquals(expected, output);
    assertArrayEquals(expected, outputOptimized);
  }

  @Test
  @DisplayName("Reverse sorted order")
  void reverseSortedOrder() {
    int[] input = { 5, 4, 3, 2, 1 };
    int[] expected = { 4, 3, 2, 1, 0 };
    int[] output = obj.naiveNumSmallElementsRight(input);
    int[] outputOptimized = obj.optimizedNumSmallElementsRight(input);
    assertArrayEquals(expected, output);
    assertArrayEquals(expected, outputOptimized);
  }

  @Test
  @DisplayName("Random Order")
  void randomOrder() {
    int[] input = { 1, 3, 4, 9, 6, 1 };
    int[] expected = { 1, 1, 2, 1, 0 };
    int[] output = obj.naiveNumSmallElementsRight(input);
    int[] outputOptimized = obj.optimizedNumSmallElementsRight(input);
    assertArrayEquals(expected, output);
    assertArrayEquals(expected, outputOptimized);
  }

}

[3,4,9,6,1]

[1,3,4,6,9,]