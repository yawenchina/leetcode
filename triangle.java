public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(triangle.get(0).get(0));
        int size = triangle.size();
        int i = 1;
        while(i < size){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            if(i == 1){
                temp.add(result.get(0)+triangle.get(i).get(0));
                 temp.add(result.get(0)+triangle.get(i).get(1));
            }else{
                int sizze = result.size();
                temp.add(result.get(0)+triangle.get(i).get(0));
                for(int p = 1; p < sizze ;p++){
                    temp.add(Math.min(result.get(p-1),result.get(p))+triangle.get(i).get(p));
                }
                 temp.add(result.get(sizze -1)+triangle.get(i).get(sizze));
            }
            result = new ArrayList<Integer>(temp);
            i++;
        }
        int max = result.get(0);
        for(int m = 1; m < result.size(); m++){
            if(result.get(m) < max){
                max = result.get(m);
            }
        }
        return max;
    }
}