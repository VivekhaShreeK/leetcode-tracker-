// Last updated: 31/08/2026, 09:01:39
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public int[] nodesBetweenCriticalPoints(ListNode head) {
13        int[] result = { -1, -1 };
14        int minDistance = Integer.MAX_VALUE;
15        ListNode previousNode = head;
16        ListNode currentNode = head.next;
17        int currentIndex = 1;
18        int previousCriticalIndex = 0;
19        int firstCriticalIndex = 0;
20        while (currentNode.next != null) {
21            if (
22                (currentNode.val < previousNode.val &&
23                    currentNode.val < currentNode.next.val) ||
24                (currentNode.val > previousNode.val &&
25                    currentNode.val > currentNode.next.val)
26            ) {
27                if (previousCriticalIndex == 0) {
28                    previousCriticalIndex = currentIndex;
29                    firstCriticalIndex = currentIndex;
30                } else {
31                    minDistance = Math.min(
32                        minDistance,
33                        currentIndex - previousCriticalIndex
34                    );
35                    previousCriticalIndex = currentIndex;
36                }
37            }
38            currentIndex++;
39            previousNode = currentNode;
40            currentNode = currentNode.next;
41        }
42        if (minDistance != Integer.MAX_VALUE) {
43            int maxDistance = previousCriticalIndex - firstCriticalIndex;
44            result = new int[] { minDistance, maxDistance };
45        }
46        return result;
47    }
48}