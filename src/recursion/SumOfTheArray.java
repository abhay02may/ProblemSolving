package recursion;

public class SumOfTheArray {

    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        int result=sumOfArray(arr,5);
        System.out.println(result);
    }

    public static int sumOfArray(int arr[],int n){
        if(n==0){
            return 0;
        }
        int sum=arr[n-1]+sumOfArray(arr,n-1);
        return sum;
    }

}
