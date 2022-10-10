package recursion;

public class MaxVauleInArray {
    public static void main(String[] args) {
        int arr[]={7,2,5,19,1,14};
        int max=maxValue(arr,arr.length);
        System.out.println("Biggest Value in Array is : "+max);
    }

    public static int maxValue(int arr[],int n){
        if(n==1){
            return arr[0];
        }
        return Math.max(arr[n-1],maxValue(arr,n-1));
    }

}
