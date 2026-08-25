// Last updated: 25/08/2026, 09:02:28
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        Set<Integer> seen = new HashSet<>();
4        for (int num : nums) {
5            seen.add(num);
6        }
7        int ans = k;
8        while (seen.contains(ans)) {
9            ans += k;
10        }
11        return ans;
12    }
13}