// Last updated: 20/09/2026, 15:15:50
1class Solution {
2
3    public boolean checkOverlap(
4        int radius,
5        int xCenter,
6        int yCenter,
7        int x1,
8        int y1,
9        int x2,
10        int y2
11    ) {
12        /* The center of the circle is inside the rectangle */
13        if (x1 <= xCenter && xCenter <= x2 && y1 <= yCenter && yCenter <= y2) {
14            return true;
15        }
16        /* The center of the circle is above the rectangle */
17        if (
18            x1 <= xCenter &&
19            xCenter <= x2 &&
20            y2 <= yCenter &&
21            yCenter <= y2 + radius
22        ) {
23            return true;
24        }
25        /* The center of the circle is below the rectangle */
26        if (
27            x1 <= xCenter &&
28            xCenter <= x2 &&
29            y1 - radius <= yCenter &&
30            yCenter <= y1
31        ) {
32            return true;
33        }
34        /* The center of the circle is to the left of the rectangle */
35        if (
36            x1 - radius <= xCenter &&
37            xCenter <= x1 &&
38            y1 <= yCenter &&
39            yCenter <= y2
40        ) {
41            return true;
42        }
43        /* The center of the circle is to the right of the rectangle */
44        if (
45            x2 <= xCenter &&
46            xCenter <= x2 + radius &&
47            y1 <= yCenter &&
48            yCenter <= y2
49        ) {
50            return true;
51        }
52        /* The upper-left corner of the rectangle */
53        if (distance(xCenter, yCenter, x1, y2) <= radius * radius) {
54            return true;
55        }
56        /* The lower-left corner of the rectangle */
57        if (distance(xCenter, yCenter, x1, y1) <= radius * radius) {
58            return true;
59        }
60        /* The upper-right corner of the rectangle */
61        if (distance(xCenter, yCenter, x2, y2) <= radius * radius) {
62            return true;
63        }
64        /* The lower-right corner of the rectangle */
65        if (distance(xCenter, yCenter, x2, y1) <= radius * radius) {
66            return true;
67        }
68        /* No intersection */
69        return false;
70    }
71
72    public long distance(int ux, int uy, int vx, int vy) {
73        return (long) Math.pow(ux - vx, 2) + (long) Math.pow(uy - vy, 2);
74    }
75}