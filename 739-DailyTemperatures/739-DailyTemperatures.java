// Last updated: 7/9/2026, 9:51:10 AM
// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         int n = temperatures.length;
//         int[] answer = new int[n];
//         int[] stack = new int[n]; 
//         int top = -1;
//         for (int i = n - 1; i >= 0; i--) {
//             while (top >= 0 && temperatures[stack[top]] <= temperatures[i]) {
//                 top--;
//             }
//             answer[i] = (top >= 0) ? (stack[top] - i) : 0;
//             stack[++top] = i;
//         }
//         return answer;
//     }
// }


class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>(); 
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int j = stack.pop();
                answer[j] = i - j;
            }
            stack.push(i); 
        }

        return answer; 
    }
}