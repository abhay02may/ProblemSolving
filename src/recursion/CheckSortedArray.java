package recursion;

public class CheckSortedArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        boolean result=checkArray(arr,5);
        System.out.println(result);
    }

    public static boolean checkArray(int arr[],int n){
        if(n==0||n==1){
            return true;
        }
        if(arr[n-2]>arr[n-1]){
            return false;
        }
        boolean isSorted=checkArray(arr,n-1);
        return isSorted;
    }
}
