// Last updated: 7/9/2026, 9:49:06 AM
class Solution {
    public int minOperations(String s) {
        int count = 0, n = s.length();
        for (int i = 0; i < n; i++)
            count += (s.charAt(i) ^ i) & 1;
          
        return Math.min(count, n - count);
    }
}