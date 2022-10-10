package leetcode;

public class LengthOfLastWord {


    public static void main(String[] args) {
        String str="Hello     World    ";
        int lengthOfLastWord=lengthOfLastWordFromBegin(str);
        System.out.println("lengthOfLastWord : "+lengthOfLastWord);
    }

    public static int lengthOfLastWordFromBegin(String str){
        int count=0;
        if(str==null){
            return count;
        }
        int len=str.length();
        int i=0;
        while(i<len){
            if(str.charAt(i)!=' '){
                count++;
                i++;
            }else{
                while(i<len && str.charAt(i)==' '){
                    i++;
                }
                if(i==len){
                    return count;
                }else{
                    count=0;
                }
            }
        }
        return count;
    }

    public static int lengthOfLastWordByTrim(String str){
        int len=0;
        if(str==null){
            return len;
        }
        str=str.trim();
        String arr[]=str.split(" ");
        int arrSize=arr.length;
        len=arr[arrSize-1].length();
        return len;
    }
}
