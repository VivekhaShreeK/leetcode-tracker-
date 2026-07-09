// Last updated: 7/9/2026, 9:52:11 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) 
          return false;
        if(n==1) 
          return true;
        if(n%4!=0) 
          return false;
        return isPowerOfFour(n/4);
    }
}