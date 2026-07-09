// Last updated: 7/9/2026, 9:52:05 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // create the first hashset "set1" to store all the unique elements from first array.
        HashSet<Integer> set1 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }

        // create the "intersection" Hashset which will be going to store all the unique elements from the second array which are present in "set1" HashSet. 
        HashSet<Integer> intersection = new HashSet<>();
        for(int num : nums2){
            if (set1.contains(num)){
                intersection.add(num);
            }
        }

        // Conversion to primitive array to return the final answer.
        int[] result = new int[intersection.size()];
        int count = 0;
        for (int num : intersection){
            result[count++] = num;
        }

        return result;
    }
}