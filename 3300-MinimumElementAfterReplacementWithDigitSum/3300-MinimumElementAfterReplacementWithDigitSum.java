// Last updated: 23/09/2026, 23:06:05
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