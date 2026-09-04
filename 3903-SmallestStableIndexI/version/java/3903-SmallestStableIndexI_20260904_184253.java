// Last updated: 04/09/2026, 18:42:53
1public class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n = nums.length;
4        for (int i = 0; i < n; i++) {
5            int maxValue = nums[i];
6            int minValue = nums[i];
7            for (int j = 0; j < i; j++) {
8                maxValue = Math.max(maxValue, nums[j]);
9            }
10            for (int j = i + 1; j < n; j++) {
11                minValue = Math.min(minValue, nums[j]);
12            }
13            if (maxValue - minValue <= k) {
14                return i;
15            }
16        }
17        return -1;
18    }
19}