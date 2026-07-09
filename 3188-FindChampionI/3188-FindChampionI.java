// Last updated: 7/9/2026, 9:47:23 AM
class Solution {
    public int findChampion(int[][] grid) {
        int win = 0;
        for(int i = 0; i < grid[0].length; i++) {
            if(i == win) {
                continue;
            }
            if(grid[win][i] == 0) {
                win = i;
            }
        }
        return win;
    }
}