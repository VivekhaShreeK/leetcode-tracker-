// Last updated: 7/9/2026, 9:45:33 AM
class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
           int freq = map.getOrDefault(nums[i], 0);
           if(freq < k) {
                list.add(nums[i]);
                map.put(nums[i], freq + 1);
           }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        } 
        return ans;
    }
}