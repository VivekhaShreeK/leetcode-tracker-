// Last updated: 19/08/2026, 12:33:09
1class Solution {
2    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
3        int left = 0b11110000;
4        int middle = 0b11000011;
5        int right = 0b00001111;
6        Map<Integer, Integer> occupied = new HashMap<Integer, Integer>();
7        for (int[] seat : reservedSeats) {
8            if (seat[1] >= 2 && seat[1] <= 9) {
9                int origin = occupied.containsKey(seat[0])
10                    ? occupied.get(seat[0])
11                    : 0;
12                int value = origin | (1 << (seat[1] - 2));
13                occupied.put(seat[0], value);
14            }
15        }
16        int ans = (n - occupied.size()) * 2;
17        for (Map.Entry<Integer, Integer> entry : occupied.entrySet()) {
18            int row = entry.getKey(),
19                bitmask = entry.getValue();
20            if (
21                (bitmask | left) == left ||
22                (bitmask | middle) == middle ||
23                (bitmask | right) == right
24            ) {
25                ++ans;
26            }
27        }
28        return ans;
29    }
30}