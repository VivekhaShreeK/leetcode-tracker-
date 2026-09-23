// Last updated: 23/09/2026, 23:06:17
class Solution {
    public List<String> stringSequence(String target) {
        List<String> lst = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < target.length(); i++) {
            sb.append('a');
            lst.add(sb.toString());
            while(sb.charAt(sb.length() - 1) != target.charAt(i)) {
                char ch = sb.charAt(sb.length() - 1);
                ch = (char) (ch + 1);
                sb.setCharAt(sb.length()-1, ch);
                lst.add(sb.toString());
            }
        }
        return lst;
    }
}