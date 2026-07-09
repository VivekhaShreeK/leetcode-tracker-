// Last updated: 7/9/2026, 9:51:52 AM
class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 1;
        int a = nums[n-1];
        for(int i = n-2; i >= 0; i--) {
            if(nums[i] != a) {
                count++;
                a = nums[i];
                if(count == 3) {
                    return nums[i];
                }
            }
        }
        return nums[n - 1];
    }
}