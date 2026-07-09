// Last updated: 7/9/2026, 9:47:12 AM
class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[][] A = new boolean[2][27];
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int idx = ch & 31;
            int b = (ch >> 5) & 1;
            A[b][idx] = b == 0 || !A[0][idx];
        }
        int res = 0;
        for(int i = 1; i < 27; i++) {
            if(A[0][i] && A[1][i])
                res++;
        }
        return res;
    }
}