// Last updated: 7/18/2026, 11:22:59 AM
1class Solution {
2    public int findGCD(int[] nums) {
3        int mx = Integer.MIN_VALUE;
4        int mn = Integer.MAX_VALUE;
5        for (int num : nums) {
6            mn = Math.min(mn, num);
7            mx = Math.max(mx, num);
8        }
9        return gcd(mx, mn);
10    }
11    private int gcd(int a, int b) {
12        while (b != 0) {
13            int temp = b;
14            b = a % b;
15            a = temp;
16        }
17        return a;
18    }
19}