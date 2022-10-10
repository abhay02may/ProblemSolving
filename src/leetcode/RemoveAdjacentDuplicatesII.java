package leetcode;

import java.util.Stack;
/*
Input: s = "deeedbbcccbdaa", k = 3
Output: "aa"
Explanation:
First delete "eee" and "ccc", get "ddbbbdaa"
Then delete "bbb", get "dddaa"
Finally delete "ddd", get "aa"

Input: s = "pbbcggttciiippooaais", k = 2
Output: "ps"
 */

public class RemoveAdjacentDuplicatesII {
    static class Pair{
        char first;
        int  count;
        public Pair(char first,int count){
            this.first=first;
            this.count=count;
        }
    }

    public static void main(String[] args) {
        String s="pbbcggttciiippooaais";
        int k=2;
        String result=removeDuplicates(s,k);
        System.out.println("result : "+result);
    }

    public static String removeDuplicates(String s, int k) {
        String ans="";
        if("".equals(s)){
            return ans;
        }
        StringBuilder result=new StringBuilder();
        Stack<Pair> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
           if(stack.empty() || s.charAt(i) != stack.peek().first){
               Pair pair=new Pair(s.charAt(i),1);
               stack.push(pair);
            }else{
                stack.peek().count++;
                int count=stack.peek().count;
                if(k==count){
                    stack.pop();
                }
            }
        }

        while(!stack.empty()){
            int count=stack.peek().count;
            while(count>0){
                result.append(stack.peek().first);
                count--;
            }
            stack.pop();
        }
        ans=result.reverse().toString();
        return ans;
    }

}

