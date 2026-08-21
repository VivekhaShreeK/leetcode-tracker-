// Last updated: 21/08/2026, 12:19:07
1class Solution {
2    public boolean canPlaceFlowers(int[] flowerbed, int n) {
3        if (n == 0)
4            return true;
5        boolean found = false;
6        for (int i = 0; i < flowerbed.length; i++) {
7            if (flowerbed[i] == 0 &&
8                (i == 0 || flowerbed[i - 1] == 0) &&
9                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
10                flowerbed[i] = 1;
11                n--;
12                found = true;
13                if (n == 0)
14                    return true;
15            }
16        }
17        return false;
18    }
19}