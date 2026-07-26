// Last updated: 7/26/2026, 11:41:17 AM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        int a = nums[n-1] * nums[n-2] * nums[n-3];
6        int b = nums[0] * nums[1] * nums[n-1];
7        return Math.max(a, b);
8    }
9}