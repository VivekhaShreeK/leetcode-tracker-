// Last updated: 7/9/2026, 9:51:31 AM
class Solution {
    public boolean checkRecord(String s) {
        int absent = 0, late = 0;
        for(char ch : s.toCharArray()) {
            if(ch != 'L') late = 0;
            if(ch == 'L') late++;
            if(ch == 'A') absent++;
            if(absent == 2 || late == 3) return false;
        }
        return true;
    }
}