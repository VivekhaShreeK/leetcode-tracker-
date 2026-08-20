// Last updated: 20/08/2026, 09:05:46
1class Solution {
2    public int[] resultArray(int[] nums) {
3        int n = nums.length;
4        List<Integer> arr1 = new ArrayList<>();
5        List<Integer> arr2 = new ArrayList<>();
6        arr1.add(nums[0]);
7        arr2.add(nums[1]);
8        for (int i = 2; i < n; i++) {
9            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
10                arr1.add(nums[i]);
11            } else {
12                arr2.add(nums[i]);
13            }
14        }
15        int[] res = new int[n];
16        int idx = 0;
17        for (int x : arr1) {
18            res[idx++] = x;
19        }
20        for (int x : arr2) {
21            res[idx++] = x;
22        }
23        return res;
24    }
25}