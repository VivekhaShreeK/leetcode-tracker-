// Last updated: 23/09/2026, 23:11:40
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