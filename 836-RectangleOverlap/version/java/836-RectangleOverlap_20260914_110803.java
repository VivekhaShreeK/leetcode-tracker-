// Last updated: 14/09/2026, 11:08:03
1class Solution {
2    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
3        if (rec1[0] == rec1[2] || rec1[1] == rec1[3] ||
4            rec2[0] == rec2[2] || rec2[1] == rec2[3]) {
5            return false;
6        }
7        return !(rec1[2] <= rec2[0] || rec1[3] <= rec2[1] || rec1[0] >= rec2[2] 
8                || rec1[1] >= rec2[3]);
9    }
10}