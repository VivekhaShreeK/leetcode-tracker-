// Last updated: 7/9/2026, 9:50:33 AM
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;
        for(int i = 0; i < dominoes.length; i++) {
            for(int j = i + 1; j < dominoes.length; j++) {
                int a = dominoes[i][0], b = dominoes[i][1], c = dominoes[j][0], d = dominoes[j][1];
                if((a == c && b == d) || (a == d && b == c)) 
                    count++;
            }
        }
        return count;
    }
}