// Last updated: 7/9/2026, 9:48:09 AM
class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int pairs = 0;
        int left = 0;
        for(int cnt : map.values()) {
            pairs += cnt / 2;
            left += cnt % 2;
        }
        return new int[]{pairs, left};
    }
}