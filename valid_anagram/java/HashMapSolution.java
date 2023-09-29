package valid_anagram.java;

import java.util.HashMap;

public class HashMapSolution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMapFirst = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hashMapSecond = new HashMap<Character, Integer>();

        char arrayFirst[] = s.toCharArray();
        char arraySecond[] = t.toCharArray();

        for (int i = 0; i < arrayFirst.length; i++) {
            if (hashMapFirst.get(arrayFirst[i]) == null) {
                hashMapFirst.put(arrayFirst[i], 1);
            } else {
                Integer value = (int) hashMapFirst.get(arrayFirst[i]);
                hashMapFirst.put(arrayFirst[i], ++value);
            }
        }

        for (int j = 0; j < arraySecond.length; j++) {

            if (hashMapSecond.get(arraySecond[j]) == null)
                hashMapSecond.put(arraySecond[j], 1);
            else {

                Integer value = (int) hashMapSecond.get(arraySecond[j]);
                hashMapSecond.put(arraySecond[j], ++value);
            }
        }

        if (hashMapFirst.equals(hashMapSecond)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
