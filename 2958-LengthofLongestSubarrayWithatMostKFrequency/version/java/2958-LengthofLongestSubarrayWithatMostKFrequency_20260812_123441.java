// Last updated: 12/08/2026, 12:34:41
1class Solution {
2    public int maxSubarrayLength(int[] nums, int k) {
3        int ans = 0, start = -1;
4        Map<Integer, Integer> frequency = new HashMap();
5        for (int end = 0; end < nums.length; end++) {
6            frequency.put(nums[end], frequency.getOrDefault(nums[end], 0) + 1);
7            while (frequency.get(nums[end]) > k) {
8                start++;
9                frequency.put(nums[start], frequency.get(nums[start]) - 1);
10            }
11            ans = Math.max(ans, end - start);
12        }
13        return ans;
14    }
15}