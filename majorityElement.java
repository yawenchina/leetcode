public class Solution {
    public int majorityElement(int[] num) {
        int number = 1;
        int res = num[0];
        for(int i = 1; i < num.length; i++){
            if(number == 0){
                number = 1;
                res = num[i];
            }else if(num[i] == res){
                number++;
            }else {
                number--;
            }
        }
        return res;
    }
}