// Last updated: 23/09/2026, 23:13:40
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = 1 ; i < nums.length ; i++){
            nums[i] += nums[i - 1]; 
        }
        return nums;
    }
}