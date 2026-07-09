// Last updated: 7/9/2026, 9:52:24 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.replace(" " , "").toLowerCase();
        t = t.replace(" " , "").toLowerCase(); 
        if(s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int c : count) {
            if(c != 0){
                return false;
            }
        }
        return true;
    }
}
