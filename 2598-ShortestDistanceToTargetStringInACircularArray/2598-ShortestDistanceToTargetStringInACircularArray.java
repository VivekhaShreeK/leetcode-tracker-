// Last updated: 7/9/2026, 9:47:55 AM
class Solution {
    public int closestTarget(String[] words, String target, int start) {
        int n = words.length;
        for (int i = 0; i <= n >> 1; i++)
            if (words[(start + i) % n].equals(target) |
                words[(start - i + n) % n].equals(target))
                return i;
        return -1;
    }
}