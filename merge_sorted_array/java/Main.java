class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int j = m + n - 1;
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] >= nums2[p2]) {
                nums1[j--] = nums1[p1--];
            } else {
                nums1[j--] = nums2[p2--];
            }
        }
        for (int i : nums1) {
            System.out.println(i);
        }
    }
}

class Main {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 4, 5 };
        Solution solution = new Solution();
        solution.merge(nums1, 3, nums2, 3);
    }
}