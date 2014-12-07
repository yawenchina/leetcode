public class Solution {
    public int findPeakElement(int[] num) {
        for(int i = 0; i < num.length; i++){
            boolean has = true;
            if(i > 0){
                has &= num[i]>num[i-1];
            }
            if(i < num.length-1){
                has &= num[i] > num[i+1];
            }
            if(has){
                return i;
            }
        }
        return -1;
    }
}