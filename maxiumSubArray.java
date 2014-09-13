//Given an unsorted array, find the subarray that has the greatest sum. Return the sum.

public int MaxiumSubarray(int[] array){
	if(array == null || array.length == 0){
		return 0;
     }
	int[] sub = new int[array.length];
	int max = array[0];
	sub[0] =  array[0];
	for(int i = 1; i < array.length;i++){
		sub[i] = Math.max(sub[i-1] + array[i],array[i]);
		max = Math.max(sub[i],max);
}
	return max;
}
