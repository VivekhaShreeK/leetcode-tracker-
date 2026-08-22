// Last updated: 22/08/2026, 08:50:41
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int digitSum = 0;
4        int digitProduct = 1;
5        int original = n;
6        while (n > 0) {
7            int digit = n % 10;
8            n /= 10;
9            digitSum += digit;
10            digitProduct *= digit;
11        }
12        return original % (digitSum + digitProduct) == 0;
13    }
14}