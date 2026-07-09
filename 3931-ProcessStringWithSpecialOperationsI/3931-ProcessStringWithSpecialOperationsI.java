// Last updated: 7/9/2026, 9:46:28 AM
class Solution {
    public String processStr(String s) {
        StringBuilder build=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z')
            {
                build.append(ch);
            }
            else if (ch=='#')
            build.append(build);
            else if(ch=='%')
            build.reverse();
            else if(ch=='*' && build.length()>=1)
            build.deleteCharAt(build.length()-1);
        }
        return build.toString();
    }
}