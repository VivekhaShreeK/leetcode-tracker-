// Last updated: 27/07/2026, 10:15:34
public class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10; 
        }
        return x == rev || x == rev / 10; 
    }
}