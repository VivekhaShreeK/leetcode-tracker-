// Last updated: 29/08/2026, 18:51:05
1class Solution {
2    public String lexPalindromicPermutation(String s, String target) {
3        int n = s.length();
4        if (n == 1) {
5            return s.compareTo(target) > 0 ? s : "";
6        }
7        int[] cnt = new int[26];
8        for (char c : s.toCharArray()) {
9            cnt[c - 'a']++;
10        }
11        String oddChar = "";
12        for (int i = 0; i < 26; i++) {
13            if (cnt[i] % 2 == 1) {
14                if (oddChar != "") {
15                    return "";
16                }
17                oddChar = String.valueOf((char) ('a' + i));
18            }
19            cnt[i] /= 2; 
20        }
21        StringBuilder prefix = new StringBuilder();
22        for (int i = 0; i < n / 2; i++) {
23            boolean found = false;
24            for (int j = 0; j < 26; j++) {
25                if (cnt[j] == 0) {
26                    continue;
27                }
28                cnt[j]--;
29                if (
30                    check(
31                        prefix.toString(),
32                        (char) ('a' + j),
33                        cnt,
34                        oddChar,
35                        target
36                    )
37                ) {
38                    prefix.append((char) ('a' + j));
39                    found = true;
40                    break;
41                } else {
42                    cnt[j]++;
43                }
44            }
45            if (!found) {
46                return ""; 
47            }
48            if (prefix.charAt(i) > target.charAt(i)) {
49                StringBuilder left = new StringBuilder(prefix);
50                for (int j = 0; j < 26; j++) {
51                    for (int k = 0; k < cnt[j]; k++) {
52                        left.append((char) ('a' + j));
53                    }
54                }
55                String palindrome =
56                    left.toString() +
57                    oddChar +
58                    new StringBuilder(left).reverse().toString();
59                return palindrome;
60            }
61        }
62        String ans =
63            prefix.toString() +
64            oddChar +
65            new StringBuilder(prefix).reverse().toString();
66        return ans;
67    }
68    private boolean check(
69        String prefix,
70        char c,
71        int[] cnt,
72        String oddChar,
73        String target
74    ) {
75        StringBuilder left = new StringBuilder(prefix);
76        left.append(c);
77        for (int i = 25; i >= 0; i--) {
78            for (int k = 0; k < cnt[i]; k++) {
79                left.append((char) ('a' + i));
80            }
81        }
82        String palindrome =
83            left.toString() +
84            oddChar +
85            new StringBuilder(left).reverse().toString();
86        return palindrome.compareTo(target) > 0;
87    }
88}