// Last updated: 09/09/2026, 15:57:51
1class Solution {
2    public String[] uncommonFromSentences(String s1, String s2) {
3        Map<String, Integer> count = new HashMap<>();
4        for (String w : (s1 + " " + s2).split(" "))
5            count.put(w, count.getOrDefault(w, 0) + 1);
6        ArrayList<String> res = new ArrayList<>();
7        for (String w : count.keySet())
8            if (count.get(w) == 1)
9                res.add(w);
10        return res.toArray(new String[0]);
11    }
12}