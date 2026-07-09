// Last updated: 7/9/2026, 9:47:59 AM
class Solution {
    public int unequalTriplets(int[] nums) {
        int a = 0, pairs = 0, count[] = new int[1001];
        for(int i = 0; i < nums.length; i++) {
            a += pairs - count[nums[i]] * (i - count[nums[i]]);
            pairs += i -count[nums[i]];
            count[nums[i]] += 1;
        }
        return a;
    }
}