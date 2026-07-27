// Last updated: 27/07/2026, 10:14:32
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, max = nums[0];
        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}