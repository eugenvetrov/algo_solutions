class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(candidate);
        return candidate;
    }
}

public class MooreVotingMain {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 3 };
        Solution solution = new Solution();
        solution.majorityElement(nums);
    }
}
