// Last updated: 7/9/2026, 9:52:54 AM
class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int count = 0;
        for(int num : nums) {
            if(cnt == 0) {
                count = num;    
            }
            if(num == count) {
                cnt++;
            }
            else {
                cnt--;
            }
        }
        return count;
    }
}