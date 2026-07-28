// Last updated: 28/07/2026, 12:30:12
1class Solution {
2    public String smallestPalindrome(String s) {
3        int len = s.length();
4        int partition = len / 2;
5        char[] chars = s.toCharArray();
6        Arrays.sort(chars, 0, partition);
7        for (int i = 0; i < partition; i++) {
8            chars[len - 1 - i] = chars[i];
9        }
10        return new String(chars);
11    }
12}