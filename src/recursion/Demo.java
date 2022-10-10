package recursion;

public class Demo {
    public static void main(String[] args) {
        System.out.println(power(0,1));
        System.out.println(decimalToBinary(10));
    }

    public static int decimalToBinary(int n){
        if(n==0){
            return 0;
        }
        return n%2 + 10*decimalToBinary(n/2);
    }

    public static int power(int n, int pow){
        if(pow<=0){
            return 1;
        }
        if(n<=0){
            return 0;
        }

       int result= n*power(n,pow-1);
        return result;
    }
}
