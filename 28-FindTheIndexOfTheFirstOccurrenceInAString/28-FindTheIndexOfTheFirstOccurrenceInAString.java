// Last updated: 27/07/2026, 10:15:01
public class Solution{
    public static int strStr(String haystack, String needle) {
        int hs = haystack.length();
        int nd = needle.length();
        for(int i=0;i<=hs-nd;i++){
            if(haystack.substring(i,i+nd).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
