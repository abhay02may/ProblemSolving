package recursion;

public class CheckElementInArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        boolean result=checkElement(arr,5,-2);
        System.out.println(result);
    }

    public static boolean checkElement(int arr[],int n,int key){
        if(n==0){
            return false;
        }
        if(arr[n-1]==key){
            return true;
        }

        return checkElement(arr,n-1,key);
    }
}
