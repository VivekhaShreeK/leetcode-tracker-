// Last updated: 22/08/2026, 08:57:15
1class Solution {
2    public void sortColors(int[] nums) {
3        int count0 = 0;
4        int count1 = 0;
5        int count2 = 0;
6        for (int num : nums) {
7            if (num == 0)
8                count0++;
9            else if (num == 1)
10                count1++;
11            else
12                count2++;
13        }
14        int i = 0;
15        while (count0-- > 0)
16            nums[i++] = 0;
17        while (count1-- > 0)
18            nums[i++] = 1;
19        while (count2-- > 0)
20            nums[i++] = 2;
21    }
22}