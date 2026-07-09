// Last updated: 7/9/2026, 9:50:35 AM
class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] answer = new int[n];
        int depth = 0;
        for (int i = 0; i < n; i++) {
            if (seq.charAt(i) == '(') {
                depth++;
                answer[i] = depth % 2;
            } else {
                answer[i] = depth % 2; 
                depth--;
            }
        }

        return answer;
    }
}
