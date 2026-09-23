// Last updated: 23/09/2026, 23:04:04
class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false; 
        int state = 0;
        boolean inc1 = false, dec = false, inc2 = false;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) return false;
            if (state == 0) { 
                if (nums[i] > nums[i - 1]) {
                    inc1 = true;
                } else {
                    if (!inc1) return false; 
                    state = 1;
                }
            }
            if (state == 1) { 
                if (nums[i] < nums[i - 1]) {
                    dec = true;
                } else {
                    if (!dec) return false; 
                    state = 2;
                }
            }
            if (state == 2) { 
                if (nums[i] > nums[i - 1]) {
                    inc2 = true;
                } else {
                    return false;
                }
            }
        }
        return inc1 && dec && inc2;
    }
}
