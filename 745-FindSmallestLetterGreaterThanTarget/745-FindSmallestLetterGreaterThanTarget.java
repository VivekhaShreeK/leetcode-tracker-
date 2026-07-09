// Last updated: 7/9/2026, 9:51:07 AM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char a : letters) {
            if(a > target) return a;
        }
        return letters[0];
    }
}