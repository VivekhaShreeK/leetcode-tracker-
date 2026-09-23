// Last updated: 23/09/2026, 23:10:48
public class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        String prefix = word.substring(0, index + 1);
        String reversedPrefix = new StringBuilder(prefix).reverse().toString();
        return reversedPrefix + word.substring(index + 1);
    }
}