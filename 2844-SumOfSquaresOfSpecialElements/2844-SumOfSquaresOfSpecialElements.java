// Last updated: 7/9/2026, 9:47:40 AM
class Solution {
    public int sumOfSquares(int[] nums) {
        int n = 0;
        for(int i = 1; i <= nums.length; i++) {
            if(nums.length % i == 0) {
                n += nums[i - 1] * nums[i - 1];
            }
        }
        return n;
    }
}