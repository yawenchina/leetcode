package practice1;

public class mergebyarray {
	public static void main(String args[]){
	String A = "abcd";
	String B = "acde";
	String C ="";
	String m = "aabccdde";
	//System.out.print(merge(A,B,C));
	System.out.print(merge(A,B,m));
	}
	public static boolean merge(String A,String B,String m){
		if(A.length() + B.length() != m.length()){
			return false;
		}
		int lenA = A.length();
		int lenB = B.length();
		boolean[][] dp = new boolean[lenA + 1][lenB + 1];
		dp[0][0] = true;
		for(int  i = 1; i < lenA+1;i++){
			if(A.charAt(i-1) == m.charAt(i-1)){
				if(dp[0][i-1]){
					dp[0][i] =  true;
				}
			}
		}
		for(int  p = 1; p < lenA+1;p++){
			if(B.charAt(p-1) == m.charAt(p-1)){
				if(dp[p-1][0]){
					dp[p][0] =  true;
				}
			}
		}
		for(int n = 1;n <= lenA;n++){
			for(int q = 1;q <= lenB;q++){
				if(B.charAt(q-1) ==m.charAt(n+q-1) || A.charAt(n-1) ==m.charAt(n+q-1))
				if(dp[n-1][q] ||dp[n][q-1]){
					dp[n][q] = true;
				}
			}
		}
		for(int l = 0;l <= lenA;l++){
			for(int u = 0 ;u <= lenB;u++){
				System.out.print(dp[l][u]);
			}
			System.out.println("");
		}
		return dp[lenA][lenB];
	}
	
}
