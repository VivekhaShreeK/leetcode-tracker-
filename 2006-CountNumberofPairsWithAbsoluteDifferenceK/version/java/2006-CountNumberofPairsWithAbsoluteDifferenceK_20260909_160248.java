// Last updated: 09/09/2026, 16:02:48
1class Solution {
2    public int countKDifference(int[] nums, int k) {
3        Map<Integer,Integer> map = new HashMap<>();
4        int res = 0;
5        for(int i = 0;i< nums.length;i++){
6            if(map.containsKey(nums[i]-k)){
7                res+= map.get(nums[i]-k);
8            }
9            if(map.containsKey(nums[i]+k)){
10                res+= map.get(nums[i]+k);
11            }
12            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
13        }
14        return res;
15    }
16}