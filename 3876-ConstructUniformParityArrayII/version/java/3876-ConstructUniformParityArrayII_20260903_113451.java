// Last updated: 03/09/2026, 11:34:51
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        int mn = nums1[0];
4        boolean hasOdd = false;
5        for (int v : nums1) {
6            if (v < mn) {
7                mn = v;
8            }
9            if ((v & 1) == 1) {
10                hasOdd = true;
11            }
12        }
13        if ((mn & 1) == 1) {
14            return true;
15        }
16        return !hasOdd;
17    }
18}