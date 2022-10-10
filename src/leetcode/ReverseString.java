package leetcode;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        String str="Madam";
        String revStr=reverseUsing2Pointers(str);
        System.out.println("revStr : "+revStr);
    }

    public static String reverseString(String str){
        StringBuilder revStr=new StringBuilder();
        if(str==null){
            return str;
        }
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            revStr.append(str.charAt(i));
        }
        return revStr.toString();
    }

    public static String reverseUsingStack(String str){
        StringBuilder revStr=new StringBuilder();
        Stack<Character> charStack=new Stack<>();
        for(char ch: str.toCharArray()){
            charStack.push(ch);
        }
        while(!charStack.empty()){
            revStr.append(charStack.pop());
        }
        return revStr.toString();
    }

    public static String reverseUsing2Pointers(String str){
        int start=0, end=str.length()-1;
        char temp='\0';
        char charArray[]=str.toCharArray();
        while(start<=end){
             temp=charArray[start];
            charArray[start]=charArray[end];
            charArray[end]=temp;
            start++;
            end--;
        }

        return new String(charArray);
    }


}
