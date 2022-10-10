package recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        int n=10;
        printNum(n);
        System.out.println("\n Calling printNumDesc \n");
        printNumDesc(n);
    }

    public static void printNum(int n){
        if(n==0){
            return ;
        }
        printNum(n-1);
        System.out.println(n);
        return;
    }

    public static void printNumDesc(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        printNumDesc(n-1);
        return;

    }
}
