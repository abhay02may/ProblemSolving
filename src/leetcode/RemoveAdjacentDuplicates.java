package leetcode;
/*
Input: s = "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal,
and this is the only possible move.  The result of this move is that the string is "aaca",
of which only "aa" is possible, so the final string is "ca".
Input: s = "azxxzy"
Output: "ay"
 */

import java.util.Stack;

public class RemoveAdjacentDuplicates {

    public static void main(String[] args) {
        String str="abbaca";
        String result=removeDuplicates(str);
        System.out.println("result : "+result);
    }


    public static String removeDuplicates(String s) {
        String ans="";
        StringBuilder result=new StringBuilder();
        if("".equals(s)){
            return ans;
        }
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stack.empty() || s.charAt(i)!=stack.peek()){
                stack.push(s.charAt(i));
            }else{
                stack.pop();
            }
        }

        while(!stack.empty()){
            result.append(stack.peek());
            stack.pop();
        }
        ans=result.reverse().toString();
        return ans;
    }

}
