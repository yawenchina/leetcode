public class Solution {
    public ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> result = new ArrayList<String>();
        if(digits == null ){
            return result;
        }
        StringBuffer sb = new StringBuffer();
        HashMap<Character, char[]> map = new HashMap<Character, char[]>();
        map.put('0', new char[]{});
        map.put('1', new char[]{});
        map.put('2',new char[]{'a','b','c'});
        map.put('3',new char[]{'d','e','f'});
        map.put('4',new char[]{'g','h','i'});
        map.put('5',new char[]{'j','k','l'});
        map.put('6',new char[]{'m','n','o'});
        map.put('7',new char[]{'p','q','r','s'});
        map.put('8', new char[] { 't', 'u', 'v'});
        map.put('9', new char[] { 'w', 'x', 'y', 'z' });
        helper(map, digits, sb ,result);
        return result;
    }

    private void helper(HashMap<Character, char[]> map, String digits, StringBuffer sb, ArrayList<String> result){
        if(sb.length() == digits.length()){
            result.add(new String(sb.toString()));
            return;
        }
        char temp = digits.charAt(sb.length());
        char[] mm = map.get(temp);
        for(int i = 0; i < mm.length; i++){
            sb.append(mm[i]);
            helper(map, digits,sb,result);
            sb.deleteCharAt(sb.length()-1);
        }
        
        
    }
        
}