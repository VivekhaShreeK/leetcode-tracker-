// Last updated: 7/9/2026, 9:48:41 AM
class Solution {
    public int minTimeToType(String word) {
        int cnt = word.length();
        char prev = 'a';
        for(int i = 0; i < word.length(); ++i) {
            char curr = word.charAt(i);
            int diff = Math.abs(curr - prev);
            cnt += Math.min(diff, 26 - diff);
            prev = curr;
        }
        return cnt;
    }
}