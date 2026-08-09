// Last updated: 09/08/2026, 13:17:54
1class Solution {
2    public int stoneGameII(int[] piles) {
3        int[] suffixSum = Arrays.copyOf(piles, piles.length);
4        for (int i = suffixSum.length - 2; i >= 0; i--) {
5            suffixSum[i] += suffixSum[i + 1];
6        }
7        return maxStones(suffixSum, 1, 0, new int[piles.length][piles.length]);
8    }
9    private int maxStones(
10        int[] suffixSum,
11        int maxTillNow,
12        int currIndex,
13        int[][] memo
14    ) {
15        if (currIndex + 2 * maxTillNow >= suffixSum.length) {
16            return suffixSum[currIndex];
17        }
18        if (memo[currIndex][maxTillNow] > 0) return memo[currIndex][maxTillNow];
19        int res = Integer.MAX_VALUE;
20        for (int i = 1; i <= 2 * maxTillNow; i++) {
21            res = Math.min(
22                res,
23                maxStones(
24                    suffixSum,
25                    Math.max(i, maxTillNow),
26                    currIndex + i,
27                    memo
28                )
29            );
30        }
31        memo[currIndex][maxTillNow] = suffixSum[currIndex] - res;
32        return memo[currIndex][maxTillNow];
33    }
34}