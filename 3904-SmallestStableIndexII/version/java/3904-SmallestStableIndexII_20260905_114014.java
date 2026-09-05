// Last updated: 05/09/2026, 11:40:14
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n = nums.length;
4        int[] minValue = new int[n];
5        minValue[n - 1] = nums[n - 1];
6        for (int i = n - 2; i >= 0; i--) {
7            minValue[i] = Math.min(minValue[i + 1], nums[i]);
8        }
9        int maxValue = 0;
10        for (int i = 0; i < n; i++) {
11            maxValue = Math.max(maxValue, nums[i]);
12            if (maxValue - minValue[i] <= k) {
13                return i;
14            }
15        }
16        return -1;
17    }
18}