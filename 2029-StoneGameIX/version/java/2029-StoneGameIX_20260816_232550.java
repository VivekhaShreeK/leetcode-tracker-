// Last updated: 16/08/2026, 23:25:50
1class Solution {
2    public boolean stoneGameIX(int[] stones) {
3        int cnt0 = 0,
4            cnt1 = 0,
5            cnt2 = 0;
6        for (int val : stones) {
7            int type = val % 3;
8            if (type == 0) {
9                ++cnt0;
10            } else if (type == 1) {
11                ++cnt1;
12            } else {
13                ++cnt2;
14            }
15        }
16        if (cnt0 % 2 == 0) {
17            return cnt1 >= 1 && cnt2 >= 1;
18        }
19        return cnt1 - cnt2 > 2 || cnt2 - cnt1 > 2;
20    }
21}