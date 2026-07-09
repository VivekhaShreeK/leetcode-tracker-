// Last updated: 7/9/2026, 9:47:47 AM
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