public class Solution {
    public int findPeakElement(int[] num) {
        if(num == null){
            return -1;
        }
        if(num.length == 1){
        	return 0;
        }
        for(int i = 0; i <= num.length-1; i++){
            if(i  == 0 && num[i] > num[i+1]) return 0;
            if(i == num.length-1 && num[i] > num[i-1])return i; 
            if(i > 0 && i < num.length-1){
                if( num[i] > num[i-1] && num[i] > num[i+1]){
                    return i;
                }
            }else{
                continue;
            }
            
        }
        return -1;
    }
}