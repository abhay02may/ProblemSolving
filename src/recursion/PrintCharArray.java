package recursion;

public class PrintCharArray {

    public static void main(String[] args) {
        String name="abhay";
        char chArr[]=name.toCharArray();
        printArr(chArr,4);
        System.out.println("\n");
        printArr2(chArr,0,4);
        int len=lengthOfString(name);
        System.out.println("\n len : "+len);

        replaceChar(chArr,4);
        String replacedChar=new String(chArr);
        System.out.println("\n replacedChar : "+replacedChar);
    }

    public static void printArr(char chArr[],int len){
        if(chArr[0]=='\0' || len<0){
            return ;
        }
        System.out.println(chArr[len]);
        printArr(chArr,len-1);
    }

    public static void printArr2(char chArr[],int start,int end){
        if(start>end ){
            return ;
        }
        System.out.println(chArr[start]);
        printArr2(chArr,start+1,end);
    }

    public static int lengthOfString(String str){
        if("".equals(str)){
            return 0;
        }
        return lengthOfString(str.substring(1))+1;
    }

    public static void replaceChar(char chArr[], int len){
        if(chArr[0]=='\0' || len<0){
            return ;
        }
        if(chArr[len]=='a'){
            chArr[len]='x';
        }
        replaceChar(chArr,len-1);
    }
}
