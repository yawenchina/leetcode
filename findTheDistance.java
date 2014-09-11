package practice1;
import java.util.*;
public class findTheClosetDistance {
	public static void main(String args[]){
		int[] x = {1,2,3,4,5,6};
		x = doSquare(x);
		int[] y = {2,4,6,8,10};
		y = doSquare(y);
		int[] z = {1,3,5,7,9};
		z = doSquare(z);
		ArrayList<ArrayList<Integer>> result =  find(x,y,z,6);
		for(int i = 0;i < 6 ;i++){
			System.out.println(result.get(i).get(3));
			System.out.println(result.get(i).get(4));
			System.out.println(result.get(i).get(5));
			System.out.println("");
			System.out.println("");
			
		}
	}
	public static int[] doSquare(int[] x){
	
		int[] y = new int[x.length];
		for(int m =0;m < x.length;m++){
			y[m] = x[m]*x[m];
		}
		return y;
	}
	public static ArrayList<ArrayList<Integer>> find(int[] x,int[] y,int[] z,int k){
		ArrayList<ArrayList<Integer>>  result = new ArrayList<ArrayList<Integer>>();
		PriorityQueue<ArrayList<Integer>> p = new PriorityQueue<ArrayList<Integer>>(2*k, new distanceC());
		ArrayList<Integer> temp = new ArrayList<Integer>();
		HashSet<Integer> map = new HashSet<Integer>();
		temp.add(x[0]);
		temp.add(y[0]);
		temp.add(z[0]);
		temp.add(0);
		temp.add(0);
		temp.add(0);
		p.add(temp);
		map.add(getSum(x,0,y,0,z,0));
		while(result.size() < k){
			ArrayList<Integer> temp1 = p.poll();
			result.add(temp1);
		    int x1 = temp1.get(3);
		    int y1 = temp1.get(4);
		    int z1 = temp1.get(5);
		    ArrayList<Integer> temp2 = new ArrayList<Integer>();
		    if(!map.contains(getSum(x,x1+1,y,y1,z,z1))){
		    	temp2.add(x[x1+1]);
		    	temp2.add(y[y1]);
		    	temp2.add(z[z1]);
		    	temp2.add(x1+1);
		    	temp2.add(y1);
		    	temp2.add(z1);
		    	p.add(temp2);
		    	map.add(getSum(x,x1+1,y,y1,z,z1));
		    }
		    if(!map.contains(getSum(x,x1,y,y1+1,z,z1))){
		    	temp2.clear();
		    	temp2.add(x[x1]);
		    	temp2.add(y[y1+1]);
		    	temp2.add(z[z1]);
		    	temp2.add(x1);
		    	temp2.add(y1+1);
		    	temp2.add(z1);
		    	p.add(temp2);
		    	map.add(getSum(x,x1,y,y1+1,z,z1));
		    }
		    if(!map.contains(getSum(x,x1,y,y1,z,z1+1))){
		    	temp2.clear();
		    	temp2.add(x[x1]);
		    	temp2.add(y[y1]);
		    	temp2.add(z[z1+1]);
		    	temp2.add(x1);
		    	temp2.add(y1);
		    	temp2.add(z1+1);
		    	p.add(temp2);
		    	map.add(getSum(x,x1,y,y1,z,z1+1));
		    }
			
		}
		return result;
	}
	public static int getSum(int[] x,int index1,int[] y,int index2,int[] z,int index3){
		return x[index1]*x[index1]+y[index2]*y[index2]+z[index3]*z[index3];
	}
}
