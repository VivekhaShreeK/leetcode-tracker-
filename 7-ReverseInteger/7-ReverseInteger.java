// Last updated: 27/07/2026, 10:15:38
class Solution {
    public int reverse(int x) {
        int reverse = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(x != 0) {
            int num = x % 10;
            x /= 10;
            if(reverse > min / 10 || (reverse == min / 10 && num > 7)) {
                return 0;
            }
            if(reverse < max / 10 || (reverse == max / 10 && num < -8)) {
                return 0;
            }
            reverse = reverse * 10 + num;
        }
        return reverse;
    }
}