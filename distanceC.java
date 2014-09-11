package practice1;

import java.util.*;

public class distanceC implements Comparator{
	public int compare(ArrayList<Integer> a1,ArrayList<Integer> a2){
		return a1.get(0)+a1.get(1)+a1.get(2)-a2.get(0)-a2.get(1)-a2.get(2);
	}
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
