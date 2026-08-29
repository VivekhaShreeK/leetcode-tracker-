// Last updated: 29/08/2026, 18:47:20
1class Solution {
2    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
3        int[] numsSorted = new int[nums.length];
4        for (int i = 0; i < nums.length; i++) numsSorted[i] = nums[i];
5        Arrays.sort(numsSorted);
6        int currGroup = 0;
7        HashMap<Integer, Integer> numToGroup = new HashMap<>();
8        numToGroup.put(numsSorted[0], currGroup);
9        HashMap<Integer, LinkedList<Integer>> groupToList = new HashMap<>();
10        groupToList.put(
11            currGroup,
12            new LinkedList<Integer>(Arrays.asList(numsSorted[0]))
13        );
14        for (int i = 1; i < nums.length; i++) {
15            if (Math.abs(numsSorted[i] - numsSorted[i - 1]) > limit) {
16                currGroup++;
17            }
18            numToGroup.put(numsSorted[i], currGroup);
19            if (!groupToList.containsKey(currGroup)) {
20                groupToList.put(currGroup, new LinkedList<Integer>());
21            }
22            groupToList.get(currGroup).add(numsSorted[i]);
23        }
24        for (int i = 0; i < nums.length; i++) {
25            int num = nums[i];
26            int group = numToGroup.get(num);
27            nums[i] = groupToList.get(group).pop();
28        }
29        return nums;
30    }
31}