// Last updated: 23/09/2026, 23:11:39
class Solution {
    public int maxDistance(int[] A, int[] B) {
        int i, j = 1;

        for (i = 0; i < A.length && j < B.length; j++)
            if (A[i] > B[j])
                i++;

        return j - i - 1;
    }
}