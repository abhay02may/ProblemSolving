package recursion;

public class Multiply {

    public static void main(String[] args) {
        int m=5, n=5;
        int res=multiply(m,n);
        System.out.println("res: "+res);
    }

    public static int multiply(int m,int n){
        if(m==0 || n==0){
            return 0;
        }
        int smallAns=multiply(m,n-1);
        int result=smallAns+m;
        return result;
    }

}
