// Last updated: 23/09/2026, 23:12:32
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