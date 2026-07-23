// Last updated: 7/23/2026, 2:25:18 PM
1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3        List<List<Integer>> res = new ArrayList<>();
4        List<Integer> comb = new ArrayList<>();
5        backtrack(1, comb, res, n, k);
6        return res;
7    }
8    private void backtrack(int start, List<Integer> comb, List<List<Integer>> res, int n, int k) {
9        if (comb.size() == k) {
10            res.add(new ArrayList<>(comb));
11            return;
12        }
13        for (int num = start; num <= n; num++) {
14            comb.add(num);
15            backtrack(num + 1, comb, res, n, k);
16            comb.remove(comb.size() - 1);
17        }
18    } 
19}