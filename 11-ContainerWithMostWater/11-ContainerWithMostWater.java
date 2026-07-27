// Last updated: 27/07/2026, 10:15:30
class Solution {
    public int maxArea(int[] height) {
        int i = 0 , j = height.length - 1;
        int area = -1;
        while (i < j) {
            int width = j - i;
            int breadth = Math.min(height[i] , height[j]);
            int smallArea = width * breadth;
            if(smallArea > area){
                area = smallArea;
            }
            if(height[i] > height[j]) {
                j--;
            }
            else {
                i++;
            }
        }
        return area;
    }
}