// Last updated: 31/08/2026, 10:13:29
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        int count = 0;
4        int n = s.length();
5        StringBuilder ans = new StringBuilder();
6        for (int i = n - 1; i >= 0; i--) {
7            if (s.charAt(i) != '-') {
8                ans.append(Character.toUpperCase(s.charAt(i)));
9                count++;
10                if (count == k) {
11                    ans.append('-');
12                    count = 0;
13                }
14            }
15        }
16        if (ans.length() > 0 && ans.charAt(ans.length()-1) == '-') { 
17            ans = new StringBuilder(ans.substring(0, ans.length()-1));
18        }
19        ans.reverse();
20        return ans.toString();
21    }
22}