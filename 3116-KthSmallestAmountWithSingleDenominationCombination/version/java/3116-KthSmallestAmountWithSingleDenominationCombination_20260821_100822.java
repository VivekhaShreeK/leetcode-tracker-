// Last updated: 21/08/2026, 10:08:22
1class Solution {
2    public long findKthSmallest(int[] coins, int k) {
3        Arrays.sort(coins);
4        int n = coins.length;
5        int m = 1 << n;
6        long l = k;
7        long r = (long) coins[0] * k + 1;
8        int[] bitCount = new int[m];
9        long[] lcm = new long[m];
10        for (int mask = 1; mask < m; mask++) {
11            long curLcm = 1;
12            for (int i = 0; i < n; i++) {
13                if (((mask >> i) & 1) == 1) {
14                    long g = gcd(curLcm, coins[i]);
15                    long tmp = curLcm / g;
16                    if (tmp <= r / coins[i]) {
17                        curLcm = tmp * coins[i];
18                    } else {
19                        curLcm = r + 1;
20                        break;
21                    }
22                    bitCount[mask]++;
23                }
24            }
25            lcm[mask] = curLcm;
26        }
27        while (l < r) {
28            long x = l + (r - l) / 2;
29            if (count(x, m, lcm, bitCount) >= k) {
30                r = x;
31            } else {
32                l = x + 1;
33            }
34        }
35        return l;
36    }
37    private long count(long x, int m, long[] lcm, int[] bitCount) {
38        long res = 0;
39        for (int mask = 1; mask < m; mask++) {
40            if (lcm[mask] > x) continue;
41            if ((bitCount[mask] & 1) == 1) {
42                res += x / lcm[mask];
43            } else {
44                res -= x / lcm[mask];
45            }
46        }
47        return res;
48    }
49    private long gcd(long a, long b) {
50        while (b != 0) {
51            long t = b;
52            b = a % b;
53            a = t;
54        }
55        return a;
56    }
57}