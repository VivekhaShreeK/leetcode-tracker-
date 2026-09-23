// Last updated: 23/09/2026, 23:03:58
class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int a = 0, max = 1;
        for(int i = 0; i < n; i++) {
            while((long)nums[i] > (long)nums[a]*k) {
                a++;
            }
            max = Math.max(max, i-a+1);
        }
        return n-max;
    }
}