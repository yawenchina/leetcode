public String countandSay(int n){
	String old = "1";
	while(--n > 0){
		StringBuffer bu = new StringBuffer();
		char[] array = new old.toCharArray();
		for(int i = 0; i < old.length(); i++){
			int count = 1;
			while(i+1 < old.length()&& array[i] == array[i+1]){
				i++;
				count++;
			}
			bu.append(count).append(array[i]);
		}
			old = bu.toString();
	}
	return old;
}