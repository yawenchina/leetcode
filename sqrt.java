public class Solution {
    public int sqrt(int x) {
        long first = 0;
        long last = x;
        long mid =0;
        while(first <= last){
             mid =(first+last)/2;
            if(mid*mid <x){
                first = mid+1;
            }else if(mid*mid == x){
                return (int)mid;
            }else{
                last=mid-1;
            }
        }
        mid = (first+last)/2;
        return (int)mid;
        
    }
}