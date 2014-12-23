public class Solution {
    public int compareVersion(String version1, String version2) {
        long a = 0;
        long b = 0;
        int len1 = version1.length();
        int len2 = version2.length();
        int i = 0;
        int j = 0;
        while(i < len1 || j < len2){
            a = 0;
            b = 0;
            while(i < len1 && version1.charAt(i)!= '.'){
                a = a*10+version1.charAt(i)-'0';
                ++i;
            }
            ++i;
            while(j < len2 && version2.charAt(j)!= '.'){
                b = b*10+version2.charAt(j)-'0';
                ++j;
            }
            ++j;
            if(a > b) return 1;
            if(a <b) return -1;
            
        }
        return 0;
    }
}