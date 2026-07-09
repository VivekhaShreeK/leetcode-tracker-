// Last updated: 7/9/2026, 9:47:19 AM
class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for(char c : word.toCharArray()) {
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        int push = 0, idx = 0;
        for(int i = 25; i >= 0; i--) {
            if(freq[i] == 0) break;
            push += freq[i] * (idx / 8 + 1);
            idx++; 
        }
        return push;
    }
}