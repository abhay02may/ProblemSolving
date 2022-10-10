package recursion;

public class GCD {
    public static void main(String[] args) {
        int a=20,b=48;
        int gcd=gcd(a,b);
        System.out.println(gcd);
    }

    public static int gcd(int a,int b){
        if(a<0 || b<0){
            return -1;
        }
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
