// Last updated: 23/09/2026, 23:08:39
class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String d : details) {
            if((((d.charAt(11) - '0') * 10) + (d.charAt(12) - '0')) > 60) {
                count++;
            }
        }
        return count;
    }
}