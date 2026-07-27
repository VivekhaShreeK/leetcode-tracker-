// Last updated: 27/07/2026, 10:14:56
class Solution {
    public int search(int[] nums, int target) {
        int idx = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                idx = i;
                break;
            }
            else {
                idx = -1;
            }
        }
        return idx;
    }
}