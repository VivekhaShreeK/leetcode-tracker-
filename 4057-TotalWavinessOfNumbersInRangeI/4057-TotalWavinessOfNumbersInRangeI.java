// Last updated: 7/9/2026, 9:45:55 AM
class Solution {
    public int totalWaviness(int num1, int num2) {
        int total = 0;
        for (int i = num1; i <= num2; i++) {
            total += getWaviness(i);
        }
        return total;
    }
    private int getWaviness(int x) {
        String s = Integer.toString(x);
        int waviness = 0;
        for (int i = 1; i < s.length() - 1; i++) {
            boolean isPeak =
                s.charAt(i) > s.charAt(i - 1) && s.charAt(i) > s.charAt(i + 1);
            boolean isValley =
                s.charAt(i) < s.charAt(i - 1) && s.charAt(i) < s.charAt(i + 1);
            if (isPeak || isValley) {
                waviness++;
            }
        }
        return waviness;
    }
}