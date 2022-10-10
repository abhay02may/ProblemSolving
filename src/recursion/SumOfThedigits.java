package recursion;

public class SumOfThedigits {

    public static void main(String[] args) {
        int n=12345;
        int res=sumOfDigits(n);
        System.out.println(res);
    }

    public static int sumOfDigits(int n){
        if(n==0||n==1){
            return n;
        }

        int smallOutput=sumOfDigits(n/10);
        int lastDigit=n%10;
        int  result=lastDigit+smallOutput;
        return result;
    }
}
