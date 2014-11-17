public class Solution {
    
    public ArrayList<String> restoreIpAddresses(String s) {
        ArrayList<String> result = new ArrayList<String>();
       if(s == null || s.length() < 4 || s.length() >12){
           return result;
       }
       ArrayList<String> list = new ArrayList<String>();
       helper(result, list, s, 0);
       return result;
    }
    
    public void helper(ArrayList<String> result, ArrayList<String> list, String s, int start){
      if(list.size() == 4){
          if(start != s.length()){
              return;
          }
          StringBuffer bu = new StringBuffer();
          for(String one : list){
              bu.append(one);
              bu.append(".");
          }
          bu.deleteCharAt(bu.length()-1);
          result.add(new String(bu.toString()));
          return ;
      }
      for(int i = start;i < start+3 && i < s.length(); i++){
          String sub = s.substring(start, i+1);
          if(isvalid(sub)){
              list.add(sub);
              helper(result, list, s, i+1);
              list.remove(list.size()-1);
          }
      }
    }
    
    private boolean isvalid(String s){
       if(s.charAt(0) == '0'){
           return s.equals("0");
       }
       int digit = Integer.valueOf(s);
       return digit >= 0 && digit <= 255;
    }
}