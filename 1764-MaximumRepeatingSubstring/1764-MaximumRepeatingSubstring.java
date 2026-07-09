// Last updated: 7/9/2026, 9:49:15 AM
class Solution {
    public int maxRepeating(String sequence, String word) {
        int k = 0;
        String s = word;
        while(sequence.contains(s)) {
            k++;
            s += word;
        }
        return k;
    }
}