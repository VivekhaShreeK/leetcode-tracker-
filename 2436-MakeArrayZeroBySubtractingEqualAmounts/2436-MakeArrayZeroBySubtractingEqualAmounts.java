// Last updated: 7/9/2026, 9:48:08 AM
class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int a : nums) {
            if(a > 0) {
                set.add(a);
            }
        }
        return set.size();
    }
}