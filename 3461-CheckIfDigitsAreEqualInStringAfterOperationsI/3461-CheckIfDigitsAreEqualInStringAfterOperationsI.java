// Last updated: 23/09/2026, 23:05:34
class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        for(int i = 1; i <= n-2; i++) {
            for(int j = 0; j <= n-1-i; j++) {
                int d1 = arr[j] - '0';
                int d2 = arr[j+1] - '0';
                arr[j] = (char) (((d1 + d2) % 10) + '0');
            }
        }
        return arr[0] == arr[1];
    }
}