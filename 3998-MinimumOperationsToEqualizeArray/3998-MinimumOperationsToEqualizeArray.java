// Last updated: 7/9/2026, 9:46:03 AM
class Solution {
    public int minOperations(int[] nums) {
        int first = nums[0];
        for(int num : nums) {
            if(num != first) {
                return 1;
            }
        }
        return 0;
    }
}