public class Solution {
    public int threeSumClosest(int[] num, int target) {
       if(num == null || num.length < 3){
           return 0;
       }
       if(num.length == 3){
           return num[0]+num[1]+num[2];
       }
       Arrays.sort(num);
       int result = Integer.MAX_VALUE/2;
       for(int i = 0; i < num.length-2 ;i++){
           if(i > 0 && num[i] == num[i-1])
           continue;
           int start = i;
           int mid = i+1;
           int end = num.length-1;
           while(mid < end){
               int value = num[start]+num[mid]+num[end];
               if(value < target){
                   mid++;
               }else if(value >target){
                   end--;
               }else{
                   return target;
               }
               //do{mid++;}while(mid < end && num[mid-1] == num[mid]);
               //do{end--;}while(mid < end && num[end] == num[end+1]);
               result =Math.abs(value-target)< Math.abs(result-target) ? value : result;
               
           }
           
       }
        
	    return result;
    }
}