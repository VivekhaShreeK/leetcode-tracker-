// Last updated: 7/20/2026, 8:57:06 AM
1class Solution {
2    public String smallestSubsequence(String s) {
3        boolean[] vis = new boolean[26];
4        int[] num = new int[26];
5        for (int i = 0; i < s.length(); i++) {
6            num[s.charAt(i) - 'a']++;
7        }
8        StringBuffer sb = new StringBuffer();
9        for (int i = 0; i < s.length(); i++) {
10            char ch = s.charAt(i);
11            if (!vis[ch - 'a']) {
12                while (sb.length() > 0 && sb.charAt(sb.length() - 1) > ch) {
13                    if (num[sb.charAt(sb.length() - 1) - 'a'] > 0) {
14                        vis[sb.charAt(sb.length() - 1) - 'a'] = false;
15                        sb.deleteCharAt(sb.length() - 1);
16                    } else {
17                        break;
18                    }
19                }
20                vis[ch - 'a'] = true;
21                sb.append(ch);
22            }
23            num[ch - 'a'] -= 1;
24        }
25        return sb.toString();
26    }
27}