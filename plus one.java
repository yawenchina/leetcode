public class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        int carry = 0;
        for (int i = size-1; i >= 0 ;i--){
            if(digits[i] != 9){
                digits[i]+=1;
                carry =0;
                return digits;
            }else if(digits[i] == 9){
                digits[i] = 0;
                carry = 1;
            }
        }
      digits = new int[size+1];
       digits[0] = 1;
       return digits;
    }
}