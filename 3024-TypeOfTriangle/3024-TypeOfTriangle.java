// Last updated: 23/09/2026, 23:07:16
class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if(nums[0] + nums[1] <= nums[2]) {
            return "none";
        }
        else if(nums[0] == nums[2]) {
            return "equilateral";
        }
        else if(nums[0] == nums[1] || nums[1] == nums[2]) {
            return "isosceles";
        }
        return "scalene";
    }
}