package recursion;

public class CountZeros {
    public static void main(String[] args) {
        int n=1010100;
        System.out.println(countZero(n));
    }

    public static int countZero(int n){
        if(n==0){
            return 0;
        }
        int smallAns=countZero(n/10);
        int lastDigit=n%10;
        if(lastDigit==0){
            return smallAns+1;
        }else{
            return smallAns;
        }

    }
}
