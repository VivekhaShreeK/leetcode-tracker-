// Last updated: 27/07/2026, 10:15:41
class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuilder res = new StringBuilder();
        int a = 2*(numRows - 1);
        for(int row = 0; row < numRows; row++) {
            for(int idx = row; idx < s.length(); idx += a) {
                res.append(s.charAt(idx));
                int dia = idx + (a - 2 * row);
                if(row > 0 && row < numRows - 1 && dia < s.length()) {
                    res.append(s.charAt(dia));
                }
            }
        }
        return res.toString();
    }
}