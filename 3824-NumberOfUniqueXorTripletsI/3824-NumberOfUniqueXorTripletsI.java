// Last updated: 27/07/2026, 10:01:48
class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int ans = 1;
        while (ans <= n) {
            ans <<= 1;
        }
        return ans;
    }
}