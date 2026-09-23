// Last updated: 23/09/2026, 23:08:36
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int row = -1;
        int max = -1;
        for(int i = 0; i < mat.length; i++) {
            int curr = 0;
            for(int num : mat[i]) {
                curr += num;
            }
            if(curr > max) {
                max = curr;
                row = i;
            }
        } 
        return new int[] {row, max};
    }
}