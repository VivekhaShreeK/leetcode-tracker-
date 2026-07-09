// Last updated: 7/9/2026, 9:49:40 AM
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = 1 ; i < nums.length ; i++){
            nums[i] += nums[i - 1]; 
        }
        return nums;
    }
}