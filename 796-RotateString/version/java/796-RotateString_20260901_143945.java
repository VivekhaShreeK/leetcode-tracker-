// Last updated: 01/09/2026, 14:39:45
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if (s.length() != goal.length()) return false;
4        int length = s.length();
5        char[] sChars = s.toCharArray();
6        for (int rotationCount = 0; rotationCount < length; ++rotationCount) {
7            sChars = rotateOnce(sChars);
8            if (new String(sChars).equals(goal)) return true;
9        }
10        return false;
11    }
12    private char[] rotateOnce(char[] arr) {
13        char firstChar = arr[0];
14        System.arraycopy(arr, 1, arr, 0, arr.length - 1);
15        arr[arr.length - 1] = firstChar;
16        return arr;
17    }
18}