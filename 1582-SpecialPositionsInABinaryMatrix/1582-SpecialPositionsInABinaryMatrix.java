// Last updated: 23/09/2026, 23:12:57
class Solution {
    public int numSpecial(int[][] mat) {
        int ans = 0;
        int m = mat.length;
        int n = mat[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] == 0) {
                    continue;
                }
                boolean found = true;
                for(int r = 0; r < m; r++) {
                    if(r != i && mat[r][j] == 1) {
                        found = false;
                        break;
                    }
                }
                for(int c = 0; c < n; c++) {
                    if(c != j && mat[i][c] == 1) {
                        found = false;
                        break;
                    }
                }
                if(found) {
                    ans++;
                }
            }
        }
        return ans;
    }
}