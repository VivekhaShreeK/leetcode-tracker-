// Last updated: 07/08/2026, 09:00:17
1class Solution {
2    public String smallestNumber(String num, long t) {
3        long temp = t;
4        for (int i = 2; i <= 9; i++) {
5            while (temp % i == 0) {
6                temp /= i;
7            }
8        }
9        if (temp > 1) {
10            return "-1";
11        }
12        int n = num.length();
13        long[] rem = new long[n + 1];
14        rem[0] = t;
15        int pos = n - 1;
16        char[] numChars = num.toCharArray();
17        for (int i = 0; i < n; i++) {
18            if (numChars[i] == '0') {
19                pos = i;
20                break;
21            }
22            rem[i + 1] = rem[i] / gcd(rem[i], numChars[i] - '0');
23        }
24        if (rem[n] == 1) {
25            return num;
26        }
27        for (int i = pos; i >= 0; i--) {
28            while (++numChars[i] <= '9') {
29                long tNow = rem[i] / gcd(rem[i], numChars[i] - '0');
30                int k = 9;
31                for (int j = n - 1; j > i; j--) {
32                    while (tNow % k != 0) {
33                        k--;
34                    }
35                    tNow /= k;
36                    numChars[j] = (char) ('0' + k);
37                }
38                if (tNow == 1) {
39                    return new String(numChars);
40                }
41            }
42        }
43        StringBuilder ans = new StringBuilder();
44        long originalT = t;
45        for (int i = 9; i > 1; i--) {
46            while (originalT % i == 0) {
47                ans.append((char) ('0' + i));
48                originalT /= i;
49            }
50        }
51        int padding = Math.max(n + 1 - ans.length(), 0);
52        for (int i = 0; i < padding; i++) {
53            ans.append('1');
54        }
55        return ans.reverse().toString();
56    }
57    private long gcd(long a, long b) {
58        while (b != 0) {
59            long temp = b;
60            b = a % b;
61            a = temp;
62        }
63        return a;
64    }
65}