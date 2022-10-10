package normal;

public class ProdSumArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5} ;
        sumProdOfArray(arr);
    }

    public static void sumProdOfArray(int arr[]){
        int sum=0;
        int prod=1;
        for(int val:arr){
            sum+=val;
            prod*=val;
        }
        System.out.println("Sum of the Array: "+sum);
        System.out.println("Prod of the Array: "+prod);
    }
}
