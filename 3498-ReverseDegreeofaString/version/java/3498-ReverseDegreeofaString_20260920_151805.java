// Last updated: 20/09/2026, 15:18:05
1class Solution {
2
3    public int reverseDegree(String s) {
4        int ans = 0;
5        for (int i = 1; i <= s.length(); i++) {
6            ans += (26 - (s.charAt(i - 1) - 'a')) * i;
7        }
8        return ans;
9    }
10}