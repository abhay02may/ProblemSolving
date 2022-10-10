package leetcode;

import java.util.Stack;

/*
Input: tokens = ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9
 */
public class PostfixEvaluation {

    public static void main(String[] args) {
       String[] tokens={"2","1","+","3","*"};
       int result= evalRPN(tokens);
       System.out.println("result : "+result);
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        if(tokens==null){
            return 0;
        }
        String operators="+,-,*,/";

        for(int i=0;i< tokens.length;i++){
            if(operators.contains(tokens[i])){
                int val1=stack.peek();
                stack.pop();
                int val2=stack.peek();
                stack.pop();
                if("+".equals(tokens[i])){
                    stack.push(val2+val1);
                }
                if("-".equals(tokens[i])){
                    stack.push(val2-val1);
                }
                if("*".equals(tokens[i])){
                    stack.push(val2*val1);
                }
                if("/".equals(tokens[i])){
                    stack.push(val2/val1);
                }
            }else{
                stack.push(Integer.valueOf(tokens[i]));
            }
        }

        return stack.peek();
    }

}
