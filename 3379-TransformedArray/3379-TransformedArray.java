// Last updated: 23/09/2026, 23:05:53
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            int a = nums[i];
            if(a == 0) {
                res[i] = 0;
            }
            int idx = ((i + a)%n+n)%n;
            res[i] = nums[idx];
        }   
        return res;     
    }
}