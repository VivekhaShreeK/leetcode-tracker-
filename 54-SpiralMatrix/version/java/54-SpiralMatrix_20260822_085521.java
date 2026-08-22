// Last updated: 22/08/2026, 08:55:21
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        int top = 0, bottom = matrix.length - 1;
4        int left = 0, right = matrix[0].length - 1;
5        List<Integer> spiral = new ArrayList<>();
6        while (top <= bottom && left <= right) {
7            for (int i = left; i <= right; i++)
8                spiral.add(matrix[top][i]);
9            top++;
10            for (int j = top; j <= bottom; j++)
11                spiral.add(matrix[j][right]);
12            right--;
13            if (top <= bottom) {
14                for (int k = right; k >= left; k--)
15                    spiral.add(matrix[bottom][k]);
16                bottom--;
17            }
18            if (left <= right) {
19                for (int l = bottom; l >= top; l--)
20                    spiral.add(matrix[l][left]);
21                left++;
22            }
23        }
24        return spiral;
25    }
26}