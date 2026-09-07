// Last updated: 07/09/2026, 12:09:43
1class Solution {
2    public boolean canJump(int[] nums) {
3        int goal = nums.length - 1;
4
5        for (int i = nums.length - 2; i >= 0; i--) {
6            if (i + nums[i] >= goal) {
7                goal = i;
8            }
9        }
10
11        return goal == 0;        
12    }
13}