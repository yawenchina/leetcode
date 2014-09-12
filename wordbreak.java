public class Solution {
    
    public boolean wordBreak(String s, Set<String> dict) {
       boolean[] check = new boolean[s.length()+1];
       check[0] = true;
       for(int i = 0;i < s.length();i++){
           if(!check[i])
            continue;
            for(String one : dict){
                int len = one.length();
                if(len+i > s.length()){
                   continue;
               }
                if(s.substring(i,i+len).equals(one)){
                    check[i+len] = true;;
                }    
            }
       }
       return check[s.length()];
    }
}