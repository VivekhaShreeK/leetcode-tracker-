// Last updated: 27/07/2026, 10:15:03
class Solution {
    public int removeElement(int[] n1, int v) {
        int k = 0;
        for (int n : n1) {
            if (n != v) 
            n1[k++] = n;
        }
        return k;
    }
}