// Last updated: 23/09/2026, 23:12:41
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> firstOccur = new HashMap<>();
        int maxLen = -1;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(firstOccur.containsKey(ch)) {
                maxLen = Math.max(maxLen, i - firstOccur.get(ch) - 1);
            }
            else {
                firstOccur.put(ch, i);
            }
        }
        return maxLen;
    }
}