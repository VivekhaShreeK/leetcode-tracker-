// Last updated: 23/09/2026, 23:16:40
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String para = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        HashMap<String, Integer> map = new HashMap<>();
        String ans = " ";
        int max = 0;
        for(String s : para.split("\\s+")) {
            if(!ban.contains(s)) {
                map.put(s, map.getOrDefault(s, 0) + 1);
                if(map.get(s) > max) {
                    max = map.get(s);
                    ans = s;
                }
            }
        }
        return ans;
    }
}