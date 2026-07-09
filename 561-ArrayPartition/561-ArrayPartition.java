// Last updated: 7/9/2026, 9:51:29 AM
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;

        for(int i=nums.length-2; i>=0; i-=2){
            sum += nums[i];
        }
        return sum;
    }
}