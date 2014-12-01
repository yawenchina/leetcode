public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        ArrayList<Integer> t = new ArrayList<Integer>();
        while(temp.size() <= rowIndex){
            t.clear();
            t.add(1);
            for(int i = 0; i <= temp.size()-2;i++){
                int value = temp.get(i)+temp.get(i+1);
                t.add(value);
            }
            if(temp.size() >= 1)
            t.add(1);
            temp = new ArrayList<Integer>(t);
        }
        return temp;
    }
}