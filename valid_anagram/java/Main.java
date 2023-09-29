package valid_anagram.java;

public class Main {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        HashMapSolution hashMapSolution = new HashMapSolution();
        hashMapSolution.isAnagram(s, t);
        SortSolution sortSolution = new SortSolution();
        sortSolution.isAnagram(s, t);
    }
}
