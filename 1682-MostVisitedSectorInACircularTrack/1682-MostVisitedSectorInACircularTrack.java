// Last updated: 7/9/2026, 9:49:27 AM
class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> lst = new ArrayList<>();
        int start = rounds[0];
        int end = rounds[rounds.length-1];
        if(start <= end) {
            for(int i = start; i <= end; i++) {
                lst.add(i);
            }
        }
        else {
            for(int i = 1; i <= end; i++) {
                lst.add(i);
            }
            for(int i = start; i <= n; i++) {
                lst.add(i);
            }
        }
        return lst;
    }
}