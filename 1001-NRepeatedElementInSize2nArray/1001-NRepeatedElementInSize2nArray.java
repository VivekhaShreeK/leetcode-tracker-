// Last updated: 7/9/2026, 9:50:47 AM
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) {
            if(set.contains(n)) {
                return n;
            }
            set.add(n);
        }
        return -1;
    }
}