// Last updated: 26/08/2026, 12:40:10
1class Solution {
2    public String shortestBeautifulSubstring(String s, int k) {
3        int n = s.length();
4        for (int m = k; m <= n; m++) {
5            String ans = "";
6            for (int i = m; i <= n; i++) {
7                String t = s.substring(i - m, i);
8                int cnt = 0;
9                for (int j = 0; j < t.length(); j++) {
10                    cnt += t.charAt(j) - '0';
11                }
12                if ((ans.isEmpty() || t.compareTo(ans) < 0) && cnt == k) {
13                    ans = t;
14                }
15            }
16            if (!ans.isEmpty()) {
17                return ans;
18            }
19        }
20        return "";
21    }
22}