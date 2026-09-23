// Last updated: 23/09/2026, 23:11:08
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