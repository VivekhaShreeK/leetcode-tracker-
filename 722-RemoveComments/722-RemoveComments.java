// Last updated: 7/9/2026, 9:51:13 AM
class Solution {
    public List<String> removeComments(String[] source) {
        List<String> res = new ArrayList<>();
        boolean SingleLine = false; 
        boolean MultiLine = false;
        StringBuilder orig = new StringBuilder();
        StringBuilder removed = new StringBuilder();
        for (int i=0; i<source.length; i++){
            orig.append(source[i]);
            if (i<source.length-1){
                orig.append("\n");
            }
        }
        System.out.println(orig);
        for (int i=0; i<orig.length(); i++){
            if (SingleLine==false && MultiLine==false && i<orig.length()-1 && orig.charAt(i)=='/' && orig.charAt(i+1)=='/'){
                    SingleLine=true;
                    i=i+1; 
                }
            else if (SingleLine==true && MultiLine==false && i<orig.length() && orig.charAt(i)=='\n') {
                    SingleLine=false;
                    i--; 
            }
            else if (SingleLine==false && MultiLine==false && i<orig.length()-1 && orig.charAt(i)=='/' && orig.charAt(i+1)=='*'){
                    MultiLine=true;
                    i=i+1;
            }
            else if (SingleLine==false && MultiLine==true && i<orig.length()-1 && orig.charAt(i)=='*' && orig.charAt(i+1)=='/'){
                    MultiLine=false; 
                    i=i+1;
            }
            else {
                if (SingleLine==false && MultiLine==false){
                    removed.append(orig.charAt(i));
                }
            }
        }
        for (String line : removed.toString().split("\n")){
            if (!line.isEmpty()){
                res.add(line);
            }
        }
        return res;
    }
}