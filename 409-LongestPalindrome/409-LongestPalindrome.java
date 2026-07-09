// Last updated: 7/9/2026, 9:51:56 AM
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        for(char c : s.toCharArray()) {
            hash.put(c, hash.getOrDefault(c, 0)+1);
        }
        int length = 0;
        boolean odd = false;
        for(int cnt : hash.values()) {
            if(cnt % 2 == 0) {
                length += cnt;
            }
            else {
                length += cnt-1;
                odd = true;
            }
        }
        if(odd) {
            length += 1;
        }
        return length;
    }
}