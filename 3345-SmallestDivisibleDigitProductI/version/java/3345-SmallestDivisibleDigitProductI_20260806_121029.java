// Last updated: 06/08/2026, 12:10:29
1class Solution {
2    public int smallestNumber(int n, int t) {
3        while (!check(n, t)) {
4            n++;
5        }
6        return n;
7    }
8    private boolean check(int num, int t) {
9        int product = 1;
10        while (num > 0) {
11            product *= num % 10;
12            num /= 10;
13            if (product == 0) {
14                break;
15            }
16        }
17        return product % t == 0;
18    }
19}