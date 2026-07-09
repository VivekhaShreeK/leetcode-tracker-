// Last updated: 7/9/2026, 9:49:07 AM
class Solution {
    public int minCharacters(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        int[] afreq = new int[26];
        int[] bfreq = new int[26];
        int maxFreqA = 0;
        int maxFreqB = 0;
        int res = Integer.MAX_VALUE;
        for(int i = 0 ; i < a.length(); i++ ) {
            int index = a.charAt(i) -'a';
            afreq[ index ]++;    
            maxFreqA = Math.max( maxFreqA,afreq[ index ]); 
        }
        for(int i = 0 ; i < b.length(); i++ ) {
            int index = b.charAt(i) -'a';
            bfreq[ index ]++;    
            maxFreqB = Math.max( maxFreqB,bfreq[ index ]); 
        }
        res = Math.min( res, lengthA + lengthB - maxFreqA - maxFreqB );         
        for(int i = 1; i < 26; i++ ) {
            afreq[i] = afreq[i] + afreq[i-1];
            bfreq[i] = bfreq[i] + bfreq[i-1];
        } 
        for(int i =0 ; i < 25; i++ ) {
            res = Math.min( lengthA - afreq[i] + bfreq[i],res  );
            res = Math.min( lengthB - bfreq[i] + afreq[i],res  );
        }
        return res;
    }
}