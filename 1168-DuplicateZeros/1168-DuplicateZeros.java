// Last updated: 7/9/2026, 9:50:38 AM
class Solution {
    public void duplicateZeros(int[] arr) {
        int cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) cnt++;
        }
        int len = arr.length + cnt;
        for(int i = arr.length - 1, j = len - 1; i < j; i--, j--) {
            if(arr[i] != 0) {
                if(j < arr.length)
                    arr[j] = arr[i];
            }
            else {
                if(j < arr.length)
                    arr[j] = arr[i];
                    j--;
                    if(j < arr.length)
                        arr[j] = arr[i];
            }
        }
    }
}