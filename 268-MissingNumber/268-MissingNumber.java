// Last updated: 7/9/2026, 9:52:21 AM
class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        for(int i = 0; i <= nums.length; i++) {
            xor ^= i;
        }
        for(int num : nums) {
            xor ^= num;
        }
        return xor;
    }
}