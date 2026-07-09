// Last updated: 7/9/2026, 9:50:30 AM
class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()<=1)
           return "";
        char[] arr = palindrome.toCharArray();
        for(int i=0; i<arr.length/2;i++){ 
           if(arr[i] != 'a'){ 
               arr[i] = 'a';
               return String.valueOf(arr);
           }
        }
        arr[arr.length-1] = 'b';
        return String.valueOf(arr);
    }
}