// Last updated: 01/09/2026, 09:19:10
1class Solution {
2    static final int[] dx = { 0, 1, 0, -1 };
3    static final int[] dy = { 1, 0, -1, 0 };
4    public int minMoves(String[] classroom, int energy) {
5        int m = classroom.length;
6        int n = classroom[0].length();
7        int[][] id = new int[m][n];
8        int sx = 0,
9            sy = 0,
10            cnt = 0;
11        for (int i = 0; i < m; i++) {
12            for (int j = 0; j < n; j++) {
13                char c = classroom[i].charAt(j);
14                if (c == 'S') {
15                    sx = i;
16                    sy = j;
17                } else if (c == 'L') {
18                    id[i][j] = 1 << cnt;
19                    cnt++;
20                }
21            }
22        }
23        int full = 1 << cnt;
24        int[][][] bestEnergy = new int[m][n][full];
25        for (int i = 0; i < m; i++) {
26            for (int j = 0; j < n; j++) {
27                Arrays.fill(bestEnergy[i][j], -1);
28            }
29        }
30        bestEnergy[sx][sy][0] = energy;
31        class Info {
32            int x, y, mask, e, steps;
33            Info(int x, int y, int mask, int e, int steps) {
34                this.x = x;
35                this.y = y;
36                this.mask = mask;
37                this.e = e;
38                this.steps = steps;
39            }
40        }
41        Deque<Info> q = new ArrayDeque<>();
42        q.addLast(new Info(sx, sy, 0, energy, 0));
43        while (!q.isEmpty()) {
44            Info t = q.removeFirst();
45            if (t.mask == full - 1) {
46                return t.steps;
47            }
48            if (t.e == 0) {
49                continue;
50            }
51            for (int d = 0; d < 4; d++) {
52                int nx = t.x + dx[d];
53                int ny = t.y + dy[d];
54                if (nx < 0 || nx >= m || ny < 0 || ny >= n || classroom[nx].charAt(ny) == 'X') {
55                    continue;
56                }
57                int ne = classroom[nx].charAt(ny) == 'R' ? energy : t.e - 1;
58                int nmask = t.mask | id[nx][ny];
59                if (ne > bestEnergy[nx][ny][nmask]) {
60                    bestEnergy[nx][ny][nmask] = ne;
61                    q.addLast(new Info(nx, ny, nmask, ne, t.steps + 1));
62                }
63            }
64        }
65        return -1;
66    }
67}