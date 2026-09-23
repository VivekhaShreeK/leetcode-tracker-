// Last updated: 23/09/2026, 23:13:04
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