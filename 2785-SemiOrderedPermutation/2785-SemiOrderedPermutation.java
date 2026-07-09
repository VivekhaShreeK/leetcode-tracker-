// Last updated: 7/9/2026, 9:47:44 AM
class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int n = nums.length;
        int pos1 = 0, posN = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) pos1 = i;
            if (nums[i] == n) posN = i;
        }
        int swaps = pos1 + (n - 1 - posN);
        if (pos1 > posN) {
            swaps--;
        }
        return swaps;
    }
}