// Last updated: 11/08/2026, 08:51:42
1class Solution {
2    public int missingInteger(int[] nums) {
3        int n = nums.length;
4        Set<Integer> numSet = new HashSet<>(n);
5        for (int num : nums) {
6            numSet.add(num);
7        }
8        int total = nums[0];
9        for (int i = 1; i < n; i++) {
10            if (nums[i] == nums[i - 1] + 1) {
11                total += nums[i];
12            } else {
13                break;
14            }
15        }
16        while (numSet.contains(total)) {
17            total += 1;
18        }
19        return total;
20    }
21}