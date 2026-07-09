// Last updated: 7/9/2026, 9:52:53 AM
public class Solution {
    public int titleToNumber(String coltit) {
        int colnum = 0;
        for (int i = 0; i < coltit.length(); i++) {
            char currentChar = coltit.charAt(i);
            colnum = colnum*26+(currentChar-'A'+1);
        }   
        return colnum;
    }
}