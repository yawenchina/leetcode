public class Solution {
    
    public boolean wordBreak(String s, Set<String> dict) {
        boolean[] check = new boolean[s.length()+1];
        check[0] = true;
        for(int i = 0; i < s.length(); i++){
            if(!check[i]){
                continue;
            }
            for(String m : dict){
                int len = m.length();
                if(i+len > s.length()){
                    continue;
                }
                if(s.substring(i,i+len).equals(m)){
                    check[len+i] = true;
                }
            }
        }
        return check[s.length()];
      
    }
}