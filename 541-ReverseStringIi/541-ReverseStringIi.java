// Last updated: 7/9/2026, 9:51:33 AM
class Solution {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for(int i = 0; i < a.length; i+=2*k) {
            int start = i, j = Math.min(i + k-1, a.length-1);
            while(start < j) {
                char temp = a[start];
                a[start++] = a[j];
                a[j--] = temp;
            }
        }
        return new String(a);
    }
}