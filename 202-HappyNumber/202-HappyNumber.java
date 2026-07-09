// Last updated: 7/9/2026, 9:52:44 AM
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> found = new HashSet<>();
        while(n!=1){
            if(found.contains(n)) {
                return false;
            }
            found.add(n);
            n = getNext(n);
        }
        return true;
    }
    private int getNext(int n) {
        int sum = 0;
        while(n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}