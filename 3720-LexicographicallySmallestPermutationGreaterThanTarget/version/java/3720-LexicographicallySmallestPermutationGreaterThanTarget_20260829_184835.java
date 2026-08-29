// Last updated: 29/08/2026, 18:48:35
1class Solution {
2    public String lexGreaterPermutation(String s, String target) {
3        int[] cnt = new int[26];
4        for (char c : s.toCharArray()) {
5            cnt[c - 'a']++;
6        }
7        StringBuilder res = new StringBuilder();
8        int n = target.length();
9        for (int i = 0; i < n; i++) {
10            int targetChar = target.charAt(i) - 'a';
11            if (cnt[targetChar] > 0) {
12                cnt[targetChar]--;
13                if (canFormGreater(cnt, target, i + 1)) {
14                    res.append(target.charAt(i));
15                    continue;
16                }
17                cnt[targetChar]++;
18            }
19            for (int j = targetChar + 1; j < 26; j++) {
20                if (cnt[j] > 0) {
21                    cnt[j]--;
22                    res.append((char) ('a' + j));
23                    res.append(getMinString(cnt));
24                    return res.toString();
25                }
26            }
27            return "";
28        }
29        return "";
30    }
31    private boolean canFormGreater(int[] cnt, String target, int start) {
32        String maxStr = getMaxString(cnt);
33        String suffix = target.substring(start);
34        return maxStr.compareTo(suffix) > 0;
35    }
36    private String getMaxString(int[] cnt) {
37        StringBuilder res = new StringBuilder();
38        for (int i = 25; i >= 0; i--) {
39            if (cnt[i] > 0) {
40                res.append(String.valueOf((char) ('a' + i)).repeat(cnt[i]));
41            }
42        }
43        return res.toString();
44    }
45    private String getMinString(int[] cnt) {
46        StringBuilder res = new StringBuilder();
47        for (int i = 0; i < 26; i++) {
48            if (cnt[i] > 0) {
49                res.append(String.valueOf((char) ('a' + i)).repeat(cnt[i]));
50            }
51        }
52        return res.toString();
53    }
54}