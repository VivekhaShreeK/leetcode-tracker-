// Last updated: 7/20/2026, 8:54:30 AM
1class Solution {
2    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int[][] changed = new int[m][n];
6        for (int i = 0; i < m; i++) {
7            for (int j = 0; j < n; j++) {
8                int curr = i * n + j;
9                int newEle = (curr + k) % (m * n);
10                int row = newEle / n;
11                int col = newEle % n;
12                changed[row][col] = grid[i][j];
13            }
14        }
15        List<List<Integer>> result = new ArrayList<>();
16        for (int i = 0; i < m; i++) {
17            List<Integer> temp = new ArrayList<>();
18            for (int j = 0; j < n; j++) {
19                temp.add(changed[i][j]);
20            }
21            result.add(temp);
22        }
23        return result;
24    }
25}