// Last updated: 7/9/2026, 9:51:30 AM
public class Solution {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder rw = new StringBuilder(word);
            rw.reverse();
            result.append(rw).append(" ");
        }
        return result.toString().trim();
    }
}