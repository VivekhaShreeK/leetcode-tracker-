// Last updated: 7/16/2026, 9:43:46 AM
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        boolean[][] rows = new boolean[9][9];
4        boolean[][] cols = new boolean[9][9];
5        boolean[][] boxes = new boolean[9][9];
6        for (int i = 0; i < 9; i++) {
7            for (int j = 0; j < 9; j++) {
8                if (board[i][j] != '.') {
9                    int num = board[i][j] - '1';
10                    int boxIndex = (i / 3) * 3 + (j / 3);
11                    if (rows[i][num] || cols[j][num] || boxes[boxIndex][num]) {
12                        return false;
13                    }
14                    rows[i][num] = cols[j][num] = boxes[boxIndex][num] = true;
15                }
16            }
17        }
18        return true;
19    }
20}