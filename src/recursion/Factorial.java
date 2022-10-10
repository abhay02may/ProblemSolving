package recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(fact(3));
    }

    public static long fact(int n){
        if(n<0) return -1;
        if(n==0 || n==1){
            return 1;
        }
        long result=n*fact(n-1);
        return result;
    }
}
