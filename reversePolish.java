public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<Integer>();
        for(String ss: tokens) {
            if("+-*/".contains(ss)){
                if(ss.equals("+")){
                    int a = s.pop();
                    int b = s.pop();
                    s.push(a+b);
                }else if(ss.equals("-")){
                    int a = s.pop();
                    int b = s.pop();
                    s.push(b-a);
                }else if(ss.equals("*")){
                    int a = s.pop();
                    int b = s.pop();
                    s.push(a*b);
                }else{
                    int a = s.pop();
                    int b = s.pop();
                    s.push(b/a);
                }
            }else{
                s.push(Integer.parseInt(ss));
            }
        }
        return s.peek();
    }
}