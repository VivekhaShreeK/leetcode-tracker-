// Last updated: 23/09/2026, 23:16:56
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char a : letters) {
            if(a > target) return a;
        }
        return letters[0];
    }
}