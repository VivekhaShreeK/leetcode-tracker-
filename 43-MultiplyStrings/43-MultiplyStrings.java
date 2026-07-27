// Last updated: 27/07/2026, 10:14:40
class Solution {
    public String multiply(String n1, String n2) {
        if(n1.equals("0") || n2.equals("0")) {
            System.out.print("0");
            return "0";
        }
        int l1 = n1.length(), l2 = n2.length();
        int[] res = new int[l1 + l2];
        for(int i = l1-1; i >= 0; i--) {
            int d1 = n1.charAt(i) - '0';
            for(int j = l2-1; j >= 0; j--) {
                int d2 = n2.charAt(j) - '0';
                int prod = d1 * d2;
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = prod + res[p2];
                res[p2] = sum % 10;
                res[p1] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int x : res) {
            if(!(sb.length() == 0 && x == 0)) {
                sb.append(x);
            }
        }
        return sb.toString();
    }
}