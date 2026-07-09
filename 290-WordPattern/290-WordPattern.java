// Last updated: 7/9/2026, 9:52:18 AM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length) {
            return false;
        }
        HashMap<Character, String> hash = new HashMap<>();
        HashSet<String> str = new HashSet<>();
        for(int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String w = words[i];
            if(hash.containsKey(ch)) {
                if(!hash.get(ch).equals(w)) {
                    return false;
                }
            }
            else {
                if(str.contains(w)) {
                    return false;
                }
                hash.put(ch, w);
                str.add(w);
            }
        }
        return true;
    }
}