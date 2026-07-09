// Last updated: 7/9/2026, 9:46:55 AM
class Solution {
    public int minElement(int[] nums) {
        int res = 37;
        for(int n : nums) {
            int digit = 0;
            while(n > 0) {
                digit += n % 10;
                n /= 10;
            }
            res = Math.min(res, digit);
        }
        return res;
    }
}