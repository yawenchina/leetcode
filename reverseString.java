public class Solution {
    public String reverseWords(String s) {
         if(s == null || s.length() == 0){
             return  "";
         }
         String[] array = s.split(" ");
         StringBuffer sb = new StringBuffer();
         for(int i = array.length-1; i>= 0;i--){
             if(!array[i].equals("")){
                 sb.append(array[i]).append(" ");
             }
         }
         String result = sb.toString();
         return result.length() == 0 ? "" : result.substring(0, result.length()-1);
    }
}