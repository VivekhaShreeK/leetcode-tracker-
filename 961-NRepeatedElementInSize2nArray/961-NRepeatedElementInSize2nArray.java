// Last updated: 23/09/2026, 23:15:48
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