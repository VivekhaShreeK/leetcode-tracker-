// Last updated: 7/9/2026, 9:49:17 AM
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