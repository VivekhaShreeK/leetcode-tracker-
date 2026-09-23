// Last updated: 23/09/2026, 23:01:38
class Solution {
    public boolean uniformArray(int[] nums1) {
        int mn = nums1[0];
        boolean hasOdd = false;
        for (int v : nums1) {
            if (v < mn) {
                mn = v;
            }
            if ((v & 1) == 1) {
                hasOdd = true;
            }
        }
        if ((mn & 1) == 1) {
            return true;
        }
        return !hasOdd;
    }
}