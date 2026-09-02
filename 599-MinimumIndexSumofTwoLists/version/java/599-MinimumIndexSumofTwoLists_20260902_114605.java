// Last updated: 02/09/2026, 11:46:05
1public class Solution {
2    public String[] findRestaurant(String[] list1, String[] list2) {
3        HashMap < Integer, List < String >> map = new HashMap < > ();
4        for (int i = 0; i < list1.length; i++) {
5            for (int j = 0; j < list2.length; j++) {
6                if (list1[i].equals(list2[j])) {
7                    if (!map.containsKey(i + j))
8                        map.put(i + j, new ArrayList < String > ());
9                    map.get(i + j).add(list1[i]);
10                }
11            }
12        }
13        int min_index_sum = Integer.MAX_VALUE;
14        for (int key: map.keySet())
15            min_index_sum = Math.min(min_index_sum, key);
16        String[] res = new String[map.get(min_index_sum).size()];
17        return map.get(min_index_sum).toArray(res);
18    }
19}
20