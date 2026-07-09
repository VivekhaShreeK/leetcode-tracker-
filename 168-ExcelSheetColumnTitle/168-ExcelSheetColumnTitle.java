// Last updated: 7/9/2026, 9:52:56 AM
public class Solution {
    public String convertToTitle(int colnum) {
        StringBuilder coltit = new StringBuilder();
        while (colnum > 0) {
            colnum--;
            char currentChar = (char) ('A' + (colnum % 26));
            coltit.append(currentChar);
            colnum /= 26;
        }
        return coltit.reverse().toString();
    }
}