// Last updated: 29/07/2026, 10:02:41
1class Solution {
2    private long comb(long n, long m, long k) {
3        long res = 1;
4        m = Math.min(m, n - m);
5        for (long i = 1; i <= m; i++) {
6            res = (res * (n - i + 1)) / i;
7            if (res > k) {
8                return k + 1;
9            }
10        }
11        return res;
12    }
13    private long permutations(int rem, int[] bucket, long k) {
14        long ways = 1;
15        for (int i = 0; i < 26; i++) {
16            if (bucket[i] == 0) {
17                continue;
18            }
19            ways *= comb(rem, bucket[i], k);
20            if (ways > k) {
21                break;
22            }
23            rem -= bucket[i];
24        }
25        return ways;
26    }
27    public String smallestPalindrome(String s, long k) {
28        int partition = s.length() / 2;
29        int[] bucket = new int[26];
30        for (int i = 0; i < partition; i++) {
31            bucket[s.charAt(i) - 97] += 1;
32        }
33        StringBuilder left = new StringBuilder();
34        long startIndex = 1;
35        for (int pos = 0; pos < partition; pos++) {
36            for (int i = 0; i < 26; i++) {
37                if (bucket[i] == 0) {
38                    continue;
39                }
40                bucket[i] -= 1;
41                long ways = permutations(partition - pos - 1, bucket, k);
42                if (startIndex + ways > k) {
43                    left.append((char) (i + 97));
44                    break;
45                }
46                bucket[i] += 1;
47                startIndex += ways;
48            }
49        }
50        if (left.length() < partition) {
51            return "";
52        }
53        if (s.length() % 2 != 0) {
54            left.append(s.charAt(partition));
55        }
56        for (int i = partition - 1; i >= 0; i--) {
57            left.append(left.charAt(i));
58        }
59        return left.toString();
60    }
61}