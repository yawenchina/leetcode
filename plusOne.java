public class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i] = digits[i]+1;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        int[] result = new int[digits.length+1];
        Arrays.fill(result,0);
        result[0] = 1;
        return result;
    }
}