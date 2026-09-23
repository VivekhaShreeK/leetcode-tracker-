// Last updated: 23/09/2026, 23:09:40
class Solution {
    public boolean digitCount(String num) {
        int[] freq = new int[10];
        for (char ch : num.toCharArray()) {
            freq[ch - '0']++;
        }
        for (int i = 0; i < num.length(); i++) {
            int expected = num.charAt(i) - '0';
            if (freq[i] != expected) {
                return false;
            }
        }
        return true;
    }
}