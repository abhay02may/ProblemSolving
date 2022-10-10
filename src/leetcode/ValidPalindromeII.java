package leetcode;
/*
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
 */
public class ValidPalindromeII {
    public static void main(String[] args) {
        String str="cbbcc";
        System.out.println("Given String is Palindorme : "+validPalindrome(str));
    }

    public static boolean validPalindrome(String s) {
        if(s!=null && "".equals(s)){
            return true;
        }
        int start=0,end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){

                if(checkPalindrome(s,start+1,end) ||  checkPalindrome(s,start,end-1)){
                    return true;
                }else{
                    return false;
                }
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean checkPalindrome(String s,int start,int end) {

        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
