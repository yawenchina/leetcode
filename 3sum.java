public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
          Arrays.sort(num);
          ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
          if (num == null || num.length < 3){
              return result;
          }
          for(int i = 0; i < num.length-2; i++){
              if(i > 0 && num[i] == num[i-1])
              continue;
              int start = i;
              int end = num.length-1;
              int mid = start+1;
              while(mid < end){
                 
                  int value = num[start]+num[mid]+num[end];
                  if(value < 0 ){
                      mid++;
                  }else if(value > 0){
                      end--;
                  }else{
                      ArrayList<Integer> temp = new ArrayList<Integer>();
                      temp.add(num[start]);
                      temp.add(num[mid]);
                      temp.add(num[end]);
                      result.add(temp);
                      while(mid < end && mid >start+1 &&num[mid] == num[mid-1]){
                          mid++;
                      }
                      while(mid < end && end <num.length-1  && num[end] == num[end+1]){
                          end--;
                      }
                  }
              }
          }
          return result;
      
    }
}