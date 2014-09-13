public class Solution {
   public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        return  reverse(x);    
    }
    
    public boolean reverse(int x) {
        int rst = 0;
        int original = x;
        while(x != 0) {
            rst = rst * 10 + x % 10;
            x = x / 10;
        }
        return original ==rst;
    }
}