// Last updated: 27/07/2026, 10:15:19
class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return new ArrayList<>();
        String[] map = {
            "",    "",    "abc", "def", "ghi", "jkl",
            "mno", "pqrs","tuv", "wxyz"
        };
        
        List<String> result = new ArrayList<>();
        result.add(""); 
        for (char d : digits.toCharArray()) {
            List<String> temp = new ArrayList<>();
            String letters = map[d - '0'];
            for (String prefix : result) {
                for (char c : letters.toCharArray()) {
                    temp.add(prefix + c);
                }
            }
            result = temp;
        }
        return result;
    }
}