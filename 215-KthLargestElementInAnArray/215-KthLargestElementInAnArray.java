// Last updated: 7/9/2026, 9:52:37 AM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int num = nums[n-k];
        return num;
    }
}