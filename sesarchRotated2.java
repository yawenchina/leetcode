public class Solution {
    public boolean search(int[] A, int target) {
        
        
         int first = 0;
        int last = A.length-1;
        while(first <= last){
            int mid = (first+last)/2;
            if(A[mid] == target){
                return true;
            }else if(A[first] < A[mid]){
                if(target >= A[first] && target < A[mid]){
                    last = mid-1;
                }else{
                    first = mid+1;
                }
            }else if(A[mid] < A[first]){
                if(target > A[mid] && target <= A[last]){
                    first = mid+1;
                }else{
                    last = mid-1;
                }
            }else{
                first++;
            }
        }
        return false;
    }
}