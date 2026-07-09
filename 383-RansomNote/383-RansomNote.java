// Last updated: 7/9/2026, 9:52:02 AM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] arr = new int[26];
        for(char ch : magazine.toCharArray()) {
            arr[ch-'a']++;
        }
        for(char ch : ransomNote.toCharArray()) {
            if(arr[ch-'a'] == 0)
                return false;
            arr[ch-'a']--;
        }
        return true;
    }
}