public class Solution {
   public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int[] number = new int[s.length()+1];
        number[0] = 1;
        number[1] = (s.charAt(0) == '0') ? 0: 1;
        for(int i = 2; i <= s.length() ;i++){
            if(s.charAt(i-1) != '0'){
                number[i] = number[i-1];
            }
            int temp = (s.charAt(i - 2) - '0') * 10 + s.charAt(i - 1) - '0';
            if(temp <=26 && temp >= 10){
                number[i]+= number[i-2];
            }
        }
        return number[s.length()];
   }
            
}