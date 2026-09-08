// Last updated: 08/09/2026, 15:50:52
1class Solution {
2    public int divide(int dividend, int divisor) {
3        if (dividend == divisor)
4            return 1;
5        boolean isPositive = (dividend < 0) == (divisor < 0);
6        long a = Math.abs((long) dividend);
7        long b = Math.abs((long) divisor);
8        long ans = 0;
9        while (a >= b) {
10            int q = 0;
11            while (a > (b << (q + 1)))
12                q++;
13            ans += (1L << q);
14            a -= (b << q);
15        }
16        if (ans == (1L << 31) && isPositive)
17            return Integer.MAX_VALUE;
18        return isPositive ? (int) ans : (int) -ans;
19    }
20}