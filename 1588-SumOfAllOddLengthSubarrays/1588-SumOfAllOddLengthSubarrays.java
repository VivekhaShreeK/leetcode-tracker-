// Last updated: 23/09/2026, 23:13:00
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length, a = 0;
        for(int i = 0; i < n; ++i) {
            for(int j = i; j < n; ++j) {
                if((j - i + 1) % 2 == 1) {
                    int sum = 0;
                    for(int k = i; k < j + 1; ++k) {
                        sum += arr[k];
                    }
                    a += sum;
                }
            }
        }
        return a;
    }
}