// Last updated: 23/09/2026, 23:03:49
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