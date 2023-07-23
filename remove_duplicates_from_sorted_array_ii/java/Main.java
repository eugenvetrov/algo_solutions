class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 2 && nums[i] == nums[i + 2]) {
                continue;
            }
            nums[count++] = nums[i];
        }
        String message = String.format("Count %s", count);
        System.out.println(message);
        for (int i = 0; i < count; i++) {
            System.out.println(nums[i]);
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 2, 3, 5, 6, 7 };
        Solution solution = new Solution();
        solution.removeDuplicates(nums);
    }
}