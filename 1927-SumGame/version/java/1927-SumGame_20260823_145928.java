// Last updated: 23/08/2026, 14:59:28
1class Solution {
2    public boolean sumGame(String num) {
3        int n = num.length();
4        int[] left = get(num.substring(0, n / 2));
5        int[] right = get(num.substring(n / 2, n));
6        int n0 = left[0], q0 = left[1];
7        int n1 = right[0], q1 = right[1];
8        return (q0 + q1) % 2 == 1 || n0 - n1 != ((q1 - q0) * 9) / 2;
9    }
10    private int[] get(String s) {
11        int nn = 0, qq = 0;
12        for (char ch : s.toCharArray()) {
13            if (ch == '?') {
14                qq++;
15            } else {
16                nn += ch - '0';
17            }
18        }
19        return new int[] { nn, qq };
20    }
21}