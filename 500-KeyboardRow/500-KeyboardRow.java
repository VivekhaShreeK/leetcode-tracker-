// Last updated: 7/9/2026, 9:51:37 AM
class Solution {
    public String[] findWords(String[] words) {
        Set<Character> row1 = Set.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
        Set<Character> row2 = Set.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
        Set<Character> row3 = Set.of('z', 'x', 'c', 'v', 'b', 'n', 'm');
        List<String> res = new ArrayList<>();

        for(String word : words){
            String lower = word.toLowerCase();
            if (row1.contains(lower.charAt(0))){
                int i = 1;
                for (; i < lower.length(); i++){
                    if (!row1.contains(lower.charAt(i))) break;
                }
                if (i == lower.length()) res.add(word);
            }
            else if (row2.contains(lower.charAt(0))){
                int i = 1;
                for (; i < lower.length(); i++){
                    if (!row2.contains(lower.charAt(i))) break;
                }
                if (i == lower.length()) res.add(word);
            }
            else{
                int i = 1;
                for (; i < lower.length(); i++){
                    if (!row3.contains(lower.charAt(i))) break;
                }
                if (i == lower.length()) res.add(word);
            }
        }
        return res.toArray(new String[0]);
    }
}