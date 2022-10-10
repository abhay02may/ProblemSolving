package recursion;

public class CheckPalindrome {
    public static void main(String[] args) {
        int arr[]={1,2,1,2,1};
        int start=0,end=4;
        boolean flag=checkPalidrome(arr,start,end);
        System.out.println(flag);
    }

    public static boolean checkPalidrome(int arr[],int start,int end){

        if(start>end){
            return true;
        }
        if(arr[start]!=arr[end]){
            return false;
        }else{
            return checkPalidrome(arr,start+1,end-1);
        }

    }
}
