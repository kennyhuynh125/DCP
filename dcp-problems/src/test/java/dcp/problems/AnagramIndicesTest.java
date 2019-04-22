package dcp.problems;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

import dcp.problems.AnagramIndices;

public class AnagramIndicesTest {
  AnagramIndices obj = new AnagramIndices();

  @Test
  @DisplayName("s is empty")
  void emptyString() {
    String s = "";
    String w = "test";
    ArrayList<Integer> expected = new ArrayList<Integer>();
    ArrayList<Integer> output = obj.naiveAnagramIndices(s, w);
    assertEquals(expected, output);
  }

  @Test
  @DisplayName("w is empty")
  void emptyInputString() {
    String s = "abcabcabc";
    String w = "";
    ArrayList<Integer> expected = new ArrayList<Integer>();
    ArrayList<Integer> output = obj.naiveAnagramIndices(s, w);
    assertEquals(expected, output);
  }

  @Test
  @DisplayName("abxaba")
  void bookProblem() {
    String s = "abxaba";
    String w = "ab";
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(0);
    expected.add(3);
    expected.add(4);
    ArrayList<Integer> output = obj.naiveAnagramIndices(s, w);
    assertEquals(expected, output);
  }

  @Test
  @DisplayName("abcabcabcabcabc - w as cab")
  void testCab() {
    String s = "abcabcabcabcabc";
    String w = "cab";
    ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
    ArrayList<Integer> output = obj.naiveAnagramIndices(s, w);
    System.out.println("EXPECTED " + expected.toString());
    System.out.println("OUTPUT " + output.toString());
    assertEquals(expected, output);
  }
}