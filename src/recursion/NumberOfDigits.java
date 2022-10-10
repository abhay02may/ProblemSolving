package recursion;

public class NumberOfDigits {
    public static void main(String[] args) {
        int n=1234;
        int count=countDigits(n);
        System.out.println("count : "+count);
    }

    public static int countDigits(int n){
        if(n==0){
            return 0;
        }

        int smallOutPut=countDigits(n/10);

        return smallOutPut+1;
    }
}
