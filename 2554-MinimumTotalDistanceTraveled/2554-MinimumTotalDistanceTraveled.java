// Last updated: 7/9/2026, 9:48:01 AM
class Solution {
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);
        Arrays.sort(factory, Comparator.comparingInt(a -> a[0]));
        List<Integer> factoryPositions = new ArrayList<>();
        for (int[] f : factory) {
            for (int i = 0; i < f[1]; i++) {
                factoryPositions.add(f[0]);
            }
        }
        Long[][] dp = new Long[robot.size()][factoryPositions.size()];
        return solve(0, 0, robot, factoryPositions, dp);
    }
    private long solve(int i, int j, List<Integer> robot, List<Integer> factoryPositions, Long[][] dp) {
        if (i == robot.size()) return 0;
        if (j == factoryPositions.size()) return (long) 1e12;
        if (dp[i][j] != null) return dp[i][j];
        long assign = Math.abs(robot.get(i) - factoryPositions.get(j)) +
                      solve(i + 1, j + 1, robot, factoryPositions, dp);
        long skip = solve(i, j + 1, robot, factoryPositions, dp);
        return dp[i][j] = Math.min(assign, skip);
    }
}