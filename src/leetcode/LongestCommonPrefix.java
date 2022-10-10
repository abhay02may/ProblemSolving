package leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String strArr[]={"flower","flow","flight"};
        String result=longestCommonPrefix(strArr);
        System.out.println("result:"+result);
    }

    public static String longestCommonPrefix(String strArr[]){
        StringBuilder commonString=new StringBuilder();
        String smallestString="";
        if(strArr==null){
            return smallestString;
        }
         /*int smallestStringIndex=0;
        for(int i=0;i<strArr.length-1;i++){
            if(i<=strArr.length-1 && strArr[i].length()<strArr[i+1].length()){
                smallestStringIndex=i;
            }
        }
        smallestString=strArr[smallestStringIndex];*/
        smallestString=strArr[0];
        System.out.println("smallestString : "+smallestString);

        for(int i=0;i<smallestString.length();i++){
            for(int j=0;j<strArr.length;j++){
                if(i>=strArr[j].length() || smallestString.charAt(i)!=strArr[j].charAt(i)){
                    return commonString.toString();
                }
            }
            commonString.append(smallestString.charAt(i));
        }

        return commonString.toString();
    }

}
