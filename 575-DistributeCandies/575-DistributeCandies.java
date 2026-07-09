// Last updated: 7/9/2026, 9:51:26 AM
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int c : candyType) {
            set.add(c);
        }
        if(set.size() > candyType.length/2) {
            return candyType.length/2;
        }
        return set.size();
    }
}