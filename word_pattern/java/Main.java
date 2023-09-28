package word_pattern.java;

import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String str) {
        if (pattern == null || str == null)
            return false;
        String[] words = str.split(" ");
        if (pattern.length() != words.length)
            return false;
        HashMap<Character, String> map = new HashMap<Character, String>();

        for (int i = 0; i < pattern.length(); i++) {
            char patterCharacter = pattern.charAt(i);
            String word = words[i];
            if (map.containsKey(patterCharacter)) {
                if (!map.get(patterCharacter).equals(word))
                    return false;
            } else {
                if (map.containsValue(word))
                    return false;
                map.put(patterCharacter, word);
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        Solution solution = new Solution();
        solution.wordPattern(pattern, s);
    }
}
