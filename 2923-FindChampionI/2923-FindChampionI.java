// Last updated: 23/09/2026, 23:07:46
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