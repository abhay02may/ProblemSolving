package recursion;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String str="AABHAAY";
        String res=removeConsecutiveDuplicates(str);
        System.out.println("res : "+res);
    }

    public static String removeConsecutiveDuplicates(String str){
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0)==str.charAt(1)){
            return removeConsecutiveDuplicates(str.substring(1));
        }else{
            return str.charAt(0) + removeConsecutiveDuplicates(str.substring(1));
        }

    }
}
