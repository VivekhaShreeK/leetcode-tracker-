// Last updated: 23/09/2026, 23:09:07
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