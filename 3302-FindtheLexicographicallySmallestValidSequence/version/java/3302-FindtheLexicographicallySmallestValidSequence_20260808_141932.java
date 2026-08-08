// Last updated: 08/08/2026, 14:19:32
1class Solution {
2    public int[] validSequence(String word1, String word2) {
3        int n = word1.length(),
4            m = word2.length();
5        int[] last = new int[m];
6        Arrays.fill(last, -1);
7        int j = m - 1;
8        for (int i = n - 1; i >= 0; --i) {
9            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
10                last[j] = i;
11                j -= 1;
12            }
13        }
14        int[] res = new int[m];
15        int skip = 0;
16        j = 0;
17        for (int i = 0; i < n; ++i) {
18            if (j == m) break;
19            if (
20                word1.charAt(i) == word2.charAt(j) ||
21                (skip == 0 && (j == m - 1 || i < last[j + 1]))
22            ) {
23                skip += word1.charAt(i) != word2.charAt(j) ? 1 : 0;
24                res[j] = i;
25                j += 1;
26            }
27        }
28        return j == m ? res : new int[0];
29    }
30}