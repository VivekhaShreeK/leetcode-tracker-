// Last updated: 20/09/2026, 15:15:07
1class Solution {
2
3    public List<String> maxNumOfSubstrings(String s) {
4        Seg[] seg = new Seg[26];
5        for (int i = 0; i < 26; ++i) {
6            seg[i] = new Seg(-1, -1);
7        }
8        // Preprocess the left and right endpoints.
9        for (int i = 0; i < s.length(); ++i) {
10            int charIdx = s.charAt(i) - 'a';
11            if (seg[charIdx].left == -1) {
12                seg[charIdx].left = seg[charIdx].right = i;
13            } else {
14                seg[charIdx].right = i;
15            }
16        }
17        for (int i = 0; i < 26; ++i) {
18            if (seg[i].left != -1) {
19                for (int j = seg[i].left; j <= seg[i].right; ++j) {
20                    int charIdx = s.charAt(j) - 'a';
21                    if (
22                        seg[i].left <= seg[charIdx].left &&
23                        seg[charIdx].right <= seg[i].right
24                    ) {
25                        continue;
26                    }
27                    seg[i].left = Math.min(seg[i].left, seg[charIdx].left);
28                    seg[i].right = Math.max(seg[i].right, seg[charIdx].right);
29                    j = seg[i].left;
30                }
31            }
32        }
33        // Greedily select intervals.
34        Arrays.sort(seg);
35        List<String> ans = new ArrayList<>();
36        int end = -1;
37        for (Seg segment : seg) {
38            int left = segment.left,
39                right = segment.right;
40            if (left == -1) {
41                continue;
42            }
43            if (end == -1 || left > end) {
44                end = right;
45                ans.add(s.substring(left, right + 1));
46            }
47        }
48        return ans;
49    }
50
51    class Seg implements Comparable<Seg> {
52
53        int left, right;
54
55        public Seg(int left, int right) {
56            this.left = left;
57            this.right = right;
58        }
59
60        public int compareTo(Seg rhs) {
61            if (right == rhs.right) {
62                return rhs.left - left;
63            }
64            return right - rhs.right;
65        }
66    }
67}