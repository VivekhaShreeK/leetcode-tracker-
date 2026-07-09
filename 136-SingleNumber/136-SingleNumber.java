// Last updated: 7/9/2026, 9:53:28 AM
class Solution {
    public int singleNumber(int[] nums) {
        // int result = 0;
        // for (int num : nums) {
        //     result ^= num; 
        // }
        // return result;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i+=2) {
            if(nums[i] != nums[i+1]) {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}