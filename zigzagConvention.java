public class Solution {
    public String convert(String s, int nRows) {
       if(nRows == 1){
           return s;
       }
       StringBuilder bu = new StringBuilder();
       int n = nRows+nRows-2;
       for(int i = 0; i < nRows; i++){
           int cur = i;
           while(cur < s.length()){
               bu.append(s.charAt(cur));
               cur += n;
               if(i > 0 && i < nRows-1 &&  cur-i-i < s.length()){
                   bu.append(s.charAt(cur-i-i));
               }
           }
       }
       return bu.toString();
    }
}