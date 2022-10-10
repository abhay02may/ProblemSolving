package leetcode;

import java.util.Locale;

public class ValidPalindrome {

    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        System.out.println("Given String is Palindorme : "+isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        boolean result=true;
        if("".equals(str)){
            return true;
        }
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        str=str.toUpperCase();

        int start=0;
        int end=str.length()-1;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                result=false;
                break;
            }
            start++;
            end--;
        }

        return result;
    }
}
