// Last updated: 24/08/2026, 14:54:22
1class Solution {
2    public int calPoints(String[] ops) {
3        Stack<Integer> stack = new Stack();
4        for(String op : ops) {
5            if (op.equals("+")) {
6                int top = stack.pop();
7                int newtop = top + stack.peek();
8                stack.push(top);
9                stack.push(newtop);
10            } else if (op.equals("C")) {
11                stack.pop();
12            } else if (op.equals("D")) {
13                stack.push(2 * stack.peek());
14            } else {
15                stack.push(Integer.valueOf(op));
16            }
17        }
18        int ans = 0;
19        for(int score : stack) ans += score;
20        return ans;
21    }
22}