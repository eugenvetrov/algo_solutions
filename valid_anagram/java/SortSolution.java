package valid_anagram.java;

import java.util.Arrays;

public class SortSolution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] arrayFirst = s.toCharArray();
        char[] arraySecond = t.toCharArray();
        Arrays.sort(arrayFirst);
        Arrays.sort(arraySecond);
        System.out.println(Arrays.equals(arrayFirst, arraySecond));
        return Arrays.equals(arrayFirst, arraySecond);
    }
}
