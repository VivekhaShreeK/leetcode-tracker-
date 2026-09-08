// Last updated: 08/09/2026, 10:20:28
1class Solution {
2    public int countCommas(int n) {
3        int res = 0;
4        for (int a = 1; a <= n; ++a) {
5            if (a > 999) {
6                res += 1;
7            }
8        }
9        return res;
10    }
11}