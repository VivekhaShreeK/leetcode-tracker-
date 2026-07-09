// Last updated: 7/9/2026, 9:45:58 AM
class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];

            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;

                int count = 0;
                int val = 0;
                boolean ok = true;

                for (int f : freq) {
                    if (f > 0) {
                        if (val == 0) val = f;
                        else if (val != f) {
                            ok = false;
                            break;
                        }
                        count++;
                    }
                }
                if (ok) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}
