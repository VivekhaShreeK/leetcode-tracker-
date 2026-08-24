// Last updated: 24/08/2026, 14:53:32
1class Solution {
2    public int[][] imageSmoother(int[][] img) {
3        int m = img.length;
4        int n = img[0].length;
5        int[][] smoothImg = new int[m][n];
6        for (int i = 0; i < m; i++) {
7            for (int j = 0; j < n; j++) {
8                int sum = 0;
9                int count = 0;
10                for (int x = i - 1; x <= i + 1; x++) {
11                    for (int y = j - 1; y <= j + 1; y++) {
12                        if (0 <= x && x < m && 0 <= y && y < n) {
13                            sum += img[x][y];
14                            count += 1;
15                        }
16                    }
17                }
18                smoothImg[i][j] = sum / count;
19            }
20        }
21        return smoothImg;
22    }
23}