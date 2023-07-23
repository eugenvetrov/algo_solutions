import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 0);
            }
            map.put(nums[i], map.get(nums[i]) + 1);
        }
        int halfLen = nums.length / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > halfLen) {
                System.out.println(entry.getKey());
                return entry.getKey();
            }
        }
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 3 };
        Solution solution = new Solution();
        solution.majorityElement(nums);
    }
}
