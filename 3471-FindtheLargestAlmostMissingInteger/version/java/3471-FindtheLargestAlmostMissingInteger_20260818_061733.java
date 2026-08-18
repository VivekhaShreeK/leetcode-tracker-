// Last updated: 18/08/2026, 06:17:33
1class Solution {
2    public int largestInteger(int[] nums, int k) {
3        int n = nums.length;
4        if (n == k) {
5            int res = nums[0];
6            for (int x : nums) {
7                res = Math.max(res, x);
8            }
9            return res;
10        }
11        int[] count = new int[51];
12        for (int x : nums) {
13            count[x]++;
14        }
15        if (k == 1) {
16            for (int i = 50; i >= 0; --i) {
17                if (count[i] == 1) {
18                    return i;
19                }
20            }
21            return -1;
22        }
23        int res = -1;
24        if (count[nums[0]] == 1) {
25            res = Math.max(res, nums[0]);
26        }
27        if (count[nums[n - 1]] == 1) {
28            res = Math.max(res, nums[n - 1]);
29        }
30        return res;
31    }
32}