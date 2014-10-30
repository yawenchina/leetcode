import java.util.*;
public class threesum {
	public static void main(String args[]){
		int[] m = {1,2,3,4,-1,-2,-3,-4,0};
		Arrays.sort(m);
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> mm = new ArrayList<Integer>();
		print(find(result, mm, m));
		
	}
	public static void print(ArrayList<ArrayList<Integer>> result){
		for(ArrayList<Integer> one : result){
			
			for(int m : one){
				System.out.print(m);
				}
			System.out.println("");
			}
		
	}
	public static ArrayList<ArrayList<Integer>> find(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> temp, int[] m){

		for(int i = 0; i < m.length-2; i++){
			if(i > 0 && m[i] == m[i-1]){
				continue;
			}
			int first = i;
			int second = i+1;
			int third = m.length-1;	
			while(second < third){
				int value = m[first]+m[second]+m[third];
				if(value < 0){
					second++;
				}else if(value == 0){
					temp.clear();
					temp.add(m[first]);
					temp.add(m[second]);
					temp.add(m[third]);
					result.add(new ArrayList<Integer>(temp));
					do{second++;}while(second < third && m[second] == m[second-1]);
					do{third--;}while(third  > second  && m[third] == m[third+1]);
		
				}else{
					third--;
				}
			}
		}
	
	return result;
		}
}
