// Last updated: 23/09/2026, 23:12:35
class Solution {
    public int minimumDeletions(String s) {
        int bCount = 0, delete = 0;
        for(char c : s.toCharArray()) {
            if(c == 'b') {
                bCount++;
            }
            else {
                delete = Math.min(delete+1, bCount);
            }
        }
        return delete;
    }
}