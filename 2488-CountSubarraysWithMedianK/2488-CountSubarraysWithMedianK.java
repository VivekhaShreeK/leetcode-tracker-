// Last updated: 23/09/2026, 23:09:05
class Solution {
        public int countSubarrays(int[] nums, int k) {
        Map<Integer, Integer> prefixSumOfBalance = new HashMap<>();
        prefixSumOfBalance.put(0, 1); 
        int ans = 0, runningBalance = 0;
        boolean found = false;
        for (int num : nums) {
            if (num < k) {
                --runningBalance;
            }else if (num > k) {
                ++runningBalance;
            }else {
                found = true;
            }
            if (found) {
                ans += prefixSumOfBalance.getOrDefault(runningBalance, 0) + prefixSumOfBalance.getOrDefault(runningBalance - 1, 0);
            }else {
                prefixSumOfBalance.put(runningBalance, prefixSumOfBalance.getOrDefault(runningBalance, 0) + 1);
            }
        }
        return ans;
    }
}