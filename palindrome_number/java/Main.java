package palindrome_number.java;

class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0)
            return true;
        if (x < 0 || x % 10 == 0)
            return false;
        int reversed_int = 0;
        while (x > reversed_int) {
            int pop = x % 10;
            x /= 10;
            reversed_int = reversed_int * 10 + pop;
        }
        if (reversed_int == x || x == reversed_int / 10) {
            return true;
        } else {
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int x = 121;
        Solution solution = new Solution();
        solution.isPalindrome(x);
    }
}
