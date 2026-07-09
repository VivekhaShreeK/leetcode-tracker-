// Last updated: 7/9/2026, 9:52:48 AM
public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1); 
            n >>= 1; 
        }
        return count;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 11;
        System.out.println("Number of set bits: " + solution.hammingWeight(n)); 
    }
}