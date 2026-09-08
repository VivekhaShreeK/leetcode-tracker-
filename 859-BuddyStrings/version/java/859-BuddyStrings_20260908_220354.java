// Last updated: 08/09/2026, 22:03:54
1class Solution {
2    public boolean buddyStrings(String s, String goal) {
3        if(s.length() != goal.length()){
4            return false;
5        }
6        int n = s.length();
7        if (s.equals(goal)) {
8            Set<Character> temp = new HashSet<>();
9            for (char c : s.toCharArray()) {
10                temp.add(c);
11            }
12            return temp.size() < goal.length(); 
13        }
14        int i = 0;
15        int j = n - 1;
16        while (i < j && s.charAt(i) == goal.charAt(i)) {
17            i++;
18        }
19        while (j >= 0 && s.charAt(j) == goal.charAt(j)) {
20            j--;
21        }
22        if (i < j) {
23            char[] sArr = s.toCharArray();
24            char temp = sArr[i];
25            sArr[i] = sArr[j];
26            sArr[j] = temp;
27            s = new String(sArr);
28        }
29        return s.equals(goal);
30    }
31}