// Last updated: 7/24/2026, 8:50:55 AM
1class Solution {
2    public int uniqueXorTriplets(int[] nums) {
3        int n = nums.length;
4        int m = 0;
5        for (int v : nums) {
6            m = Math.max(m, v);
7        }
8        int u = 1;
9        while (u <= m) {
10            u <<= 1;
11        }
12        boolean[] s = new boolean[u];
13        for (int i = 0; i < n; i++) {
14            for (int j = i; j < n; j++) {
15                s[nums[i] ^ nums[j]] = true;
16            }
17        }
18        boolean[] t = new boolean[u];
19        for (int x = 0; x < u; x++) {
20            if (!s[x]) {
21                continue;
22            }
23            for (int v : nums) {
24                t[x ^ v] = true;
25            }
26        }
27        int ans = 0;
28        for (boolean b : t) {
29            if (b) {
30                ans++;
31            }
32        }
33        return ans;
34    }
35}