// Last updated: 7/9/2026, 9:47:18 AM
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