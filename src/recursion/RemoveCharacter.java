package recursion;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str="ABHAY";
        char X='A';
        String res=removeChar(str,X);
        System.out.println("res : "+res);
    }

    public static String removeChar(String str,char X){
        if(str.length()==0){
            return "";
        }
        if(str.charAt(0)==X){
            return removeChar(str.substring(1),X);
        }
        return str.charAt(0)+ removeChar(str.substring(1),X);
    }

    
}
