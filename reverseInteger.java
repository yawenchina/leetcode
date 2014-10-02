public class Solution {
    public int reverse(int x) {
        if(x < 0){
            return -reverse(-x);
        }
        int number = 0;
        while(x > 9){
            int temp = x%10;
            number = number*10+ temp;
            x = x/10;
        }
        number = number*10+ x;
        return number ; 
    }
}