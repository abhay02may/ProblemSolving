package recursion;

public class NthFibonnaciNumber {

    public static void main(String[] args) {
        int n=10;
        int res=fibonnaciNumber(n);
        System.out.println("res : "+res);
    }

    public static int fibonnaciNumber(int n){

        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fibonnaciNumber(n-1)+fibonnaciNumber(n-2);
    }
}
