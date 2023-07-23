class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
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
        int[] nums = { 1, 2, 2, 3, 5, 2, 6 };
        Solution solution = new Solution();
        solution.removeElement(nums, 2);
    }
}
