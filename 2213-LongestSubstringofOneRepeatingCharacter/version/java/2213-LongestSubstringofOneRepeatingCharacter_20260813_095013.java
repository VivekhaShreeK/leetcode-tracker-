// Last updated: 13/08/2026, 09:50:13
1class Solution {
2    private char[] sArr;
3    private int[] pre, suf, maxLen;
4    private char[] leftChar, rightChar;
5    public int[] longestRepeating(
6        String s,
7        String queryCharacters,
8        int[] queryIndices
9    ) {
10        int n = s.length();
11        sArr = s.toCharArray();
12        pre = new int[4 * n];
13        suf = new int[4 * n];
14        maxLen = new int[4 * n];
15        leftChar = new char[4 * n];
16        rightChar = new char[4 * n];
17        build(1, 0, n - 1);
18        int k = queryIndices.length;
19        int[] ans = new int[k];
20        for (int i = 0; i < k; i++) {
21            update(1, 0, n - 1, queryIndices[i], queryCharacters.charAt(i));
22            ans[i] = maxLen[1];
23        }
24        return ans;
25    }
26    private void pushUp(int u, int l, int r) {
27        int mid = (l + r) >> 1;
28        int leftLen = mid - l + 1,
29            rightLen = r - mid;
30        int left = u << 1,
31            right = (u << 1) | 1;
32        leftChar[u] = leftChar[left];
33        rightChar[u] = rightChar[right];
34        pre[u] = pre[left];
35        if (pre[left] == leftLen && rightChar[left] == leftChar[right]) {
36            pre[u] = pre[left] + pre[right];
37        }
38        suf[u] = suf[right];
39        if (suf[right] == rightLen && rightChar[left] == leftChar[right]) {
40            suf[u] = suf[right] + suf[left];
41        }
42        maxLen[u] = Math.max(maxLen[left], maxLen[right]);
43        if (rightChar[left] == leftChar[right]) {
44            maxLen[u] = Math.max(maxLen[u], suf[left] + pre[right]);
45        }
46    }
47    private void build(int u, int l, int r) {
48        if (l == r) {
49            pre[u] = 1;
50            suf[u] = 1;
51            maxLen[u] = 1;
52            leftChar[u] = sArr[l];
53            rightChar[u] = sArr[l];
54            return;
55        }
56        int mid = (l + r) >> 1;
57        build(u << 1, l, mid);
58        build((u << 1) | 1, mid + 1, r);
59        pushUp(u, l, r);
60    }
61    private void update(int u, int l, int r, int pos, char ch) {
62        if (l == r) {
63            leftChar[u] = ch;
64            rightChar[u] = ch;
65            return;
66        }
67        int mid = (l + r) >> 1;
68        if (pos <= mid) {
69            update(u << 1, l, mid, pos, ch);
70        } else {
71            update((u << 1) | 1, mid + 1, r, pos, ch);
72        }
73        pushUp(u, l, r);
74    }
75}