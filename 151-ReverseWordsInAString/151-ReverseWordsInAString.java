// Last updated: 7/9/2026, 9:53:02 AM
class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder s1 = new StringBuilder();
        for(int i = arr.length-1; i >= 0; i--) {
            s1.append(arr[i]);
            if(i != 0) {
                s1.append(" ");
            }
        }
        return s1.toString();
    }
}