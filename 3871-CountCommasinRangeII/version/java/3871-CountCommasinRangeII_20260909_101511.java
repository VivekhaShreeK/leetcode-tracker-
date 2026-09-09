// Last updated: 09/09/2026, 10:15:11
1class Solution {
2    public long countCommas(long n) {
3        long count = 0;
4        for(long i = 1000; i <= n; i *= 1000) count += n-i+1;
5        return count;
6    }
7}