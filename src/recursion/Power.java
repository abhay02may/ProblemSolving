package recursion;

public class Power {

    public static void main(String[] args) {
        int x=5,n=3;
        int pow=power(x,n);
        System.out.println("pow : "+pow);
    }

    public static int power(int x, int n){

        if(x<=0 ){
            return 0;
        }
        if(n==0){
            return 1;
        }

        return x*power(x,n-1);

    }
}
