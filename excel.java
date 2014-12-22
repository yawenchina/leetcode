public class Solution {
    public String convertToTitle(int n) {
        StringBuffer bu = new StringBuffer();
        while(n > 0){
            int m = (n-1)%26;
        
            bu.append((char)('A'+m));
            
            n = (n-1)/26;
        }
        return bu.reverse().toString();
    }
}