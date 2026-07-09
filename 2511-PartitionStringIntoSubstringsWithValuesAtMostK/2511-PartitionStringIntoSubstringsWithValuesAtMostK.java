// Last updated: 7/9/2026, 9:48:05 AM
class Solution {
    private boolean isOk(StringBuilder sb,int k){
        return Long.parseLong(sb.toString())<=k;
    }
    public int minimumPartition(String s, int k) {
        int count=0,pos=0;
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
             if((ch-'0')>k)return -1;
             else if(!isOk(sb.append(ch),k)){
                count++;
                sb.delete(0,sb.length()-1);
            }
        }
        return count+1;

    }
}