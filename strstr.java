public int strStr(String haystack , String needle){
	if(haystack == null || needle == null){
		return -1;
	}
	int size = needle.length();
	int i = 0;
	int j = 0;
	for(i = 0; i < haystack.length()-size+1; i++){
		for( j = 0; j < size; j++){
			if(haystack.charAt(i+j) != needle.charAt(j)){
				break;
			}
		}
		if(j == size){
			return i;
		}
	}
	return -1;


}