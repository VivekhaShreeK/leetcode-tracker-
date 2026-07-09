// Last updated: 7/9/2026, 9:52:19 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int num : nums){
            if(num != 0){
                nums[index++] = num;
            }
        }
        while(index < nums.length){
            nums[index++] = 0;
        }
// ------------------------------------------------------------------
        // int left = 0;
        // for(int right = 0; right < nums.length; right++){
        //     if(nums[right] != 0){
        //         int temp = nums[left];
        //         nums[left] = nums[right];
        //         nums[right] = temp;
        //         left++;
        //     }
        // }

    }
}