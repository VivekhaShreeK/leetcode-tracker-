// Last updated: 7/9/2026, 9:51:27 AM
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m * n != r * c)
            return mat;
        int[][] a = new int[r][c];
        int cnt = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                a[cnt / c][cnt % c] = mat[i][j];
                cnt++;
            }
        }
        return a;
    }
}