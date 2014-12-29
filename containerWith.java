public class Solution {
   public int maxArea(int[] height) {  
        if(height == null || height.length <= 2){
            return 0;
        }
        int sum = 0;
        int left = 0;
        int right = height.length-1;
        while(left < right){
           sum = Math.max(Math.min(height[right], height[left])*(right-left), sum);
            if(height[right] < height[left]){
                right--;
            }else{
                left++;
            }
        }
        return sum;


       

 }  

}