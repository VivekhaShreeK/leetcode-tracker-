// Last updated: 7/9/2026, 9:48:55 AM
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int a = nums.length;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                a = Math.min(a, Math.abs(i - start));
            }
        }
        return a;
    }
}