package dcp.problems;

import java.util.*;

public class AnagramIndices {
  /**
   * Given a word w and string s, find all indices in s which are the starting
   * locations of anagrams of w. For example, given w is ab, and s is abxaba,
   * return [0, 3, 4];
   */

  /**
   * For loop and then go from i to i + w.length and compare Runtime O(n^2logn)
   * <-- can optimize by using hashmap and comparing values rather than sorting
   * Space O(n)
   */
  public ArrayList<Integer> naiveAnagramIndices(String s, String w) {
    ArrayList<Integer> results = new ArrayList<>();
    if (w.length() == 0) {
      return results;
    }
    char[] lettersOfW = w.toCharArray();
    Arrays.sort(lettersOfW);
    String wSorted = String.valueOf(lettersOfW);
    for (int i = 0; i <= s.length() - w.length(); i++) {
      String substring = s.substring(i, i + w.length());
      char[] lettersOfSubstring = substring.toCharArray();
      Arrays.sort(lettersOfSubstring);
      String substringSorted = String.valueOf(lettersOfSubstring);
      if (substringSorted.equals(wSorted)) {
        results.add(i);
      }
    }
    return results;
  }

  /**
   * O(n) runtime and space Create arrays for s and t with the letters (int[] 26)
   * GO through t and increment values at i Go through s and increment values at i
   * and once i >= length of t start to decrement
   */
  public ArrayList<Integer> optimizedAnagramIndices(String s, String t) {
    int len_s = s.length();
    int len_t = t.length();

    int[] vt = new int[26];
    for (int i = 0; i < len_t; i++) {
      vt[t.charAt(i) - 'a']++;
    }
    int[] vs = new int[26];

    ArrayList<Integer> ret_list = new ArrayList<Integer>();
    for (int i = 0; i < len_s; i++) {
      vs[s.charAt(i) - 'a']++;
      if (i >= len_t) {
        vs[s.charAt(i - len_t) - 'a']--;
      }

      if (Arrays.equals(vs, vt)) {
        ret_list.add(i - len_t + 1);
      }
    }
    return ret_list;
  }
}