// Last updated: 7/9/2026, 9:46:14 AM
class Solution {
    private int finishTime(int[] ls, int[] ld, int[] ws, int[] wd) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < ls.length; i++) {
            min = Math.min(min, ls[i] + ld[i]);
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < ws.length; i++) {
            ans = Math.min(ans, Math.max(min, ws[i]) + wd[i]);
        }
        return ans;
    }
    public int earliestFinishTime(int[] ls, int[] ld, int[] ws, int[] wd) {
        return Math.min(finishTime(ls, ld, ws, wd), finishTime(ws, wd, ls, ld));
    }
}