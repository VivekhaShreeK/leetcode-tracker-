// Last updated: 23/09/2026, 23:15:50
class Solution {
    public int minDeletionSize(String[] strs) {
        int rows = strs.length;
        int cols = strs[0].length();
        int deleteCount = 0;
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows - 1; row++) {
                if (strs[row].charAt(col) > strs[row + 1].charAt(col)) {
                    deleteCount++;
                    break; 
                }
            }
        }
        return deleteCount;
    }
}