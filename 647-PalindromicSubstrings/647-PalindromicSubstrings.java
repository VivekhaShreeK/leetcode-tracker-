// Last updated: 7/9/2026, 9:51:19 AM
class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        boolean[][] isPalindrome = new boolean[n][n];
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j+i-1 < n; j++) {
                int palindrome = j+i-1;

                if(s.charAt(j) == s.charAt(palindrome)) {
                    if(i <= 2 || isPalindrome[j + 1][palindrome - 1]) {
                        isPalindrome[j][palindrome] = true;
                        count++;
                    }
                }
            }
        }
        return count;
    }
}