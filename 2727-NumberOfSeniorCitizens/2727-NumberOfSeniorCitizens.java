// Last updated: 7/9/2026, 9:47:48 AM
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