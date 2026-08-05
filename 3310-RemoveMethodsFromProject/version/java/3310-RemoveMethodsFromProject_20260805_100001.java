// Last updated: 05/08/2026, 10:00:01
1class Solution {
2    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
3        List<Integer>[] edges = new ArrayList[n];
4        for (int i = 0; i < n; i++) {
5            edges[i] = new ArrayList<>();
6        }
7        int[] inDegree = new int[n];
8        for (int[] inv : invocations) {
9            edges[inv[0]].add(inv[1]);
10            inDegree[inv[1]]++;
11        }
12        Queue<Integer> queue = new ArrayDeque<>();
13        queue.offer(k);
14        boolean[] suspicious = new boolean[n];
15        suspicious[k] = true;
16        while (!queue.isEmpty()) {
17            int u = queue.poll();
18            for (int v : edges[u]) {
19                inDegree[v]--;
20                if (!suspicious[v]) {
21                    queue.offer(v);
22                    suspicious[v] = true;
23                }
24            }
25        }
26        boolean canRemoveAll = true;
27        List<Integer> remaining = new ArrayList<>();
28        for (int i = 0; i < n; i++) {
29            if (suspicious[i] && inDegree[i] > 0) {
30                canRemoveAll = false;
31                break;
32            } else if (!suspicious[i]) {
33                remaining.add(i);
34            }
35        }
36        if (!canRemoveAll) {
37            List<Integer> allNodes = new ArrayList<>(n);
38            for (int i = 0; i < n; i++) {
39                allNodes.add(i);
40            }
41            return allNodes;
42        }
43        return remaining;
44    }
45}