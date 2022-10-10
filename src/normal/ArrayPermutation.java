package normal;

public class ArrayPermutation {
    // 2 arrays are permutation of each other if sum1==sum2 and mul1==mul2
    // sum1 and sum2 are sum of the array and mul1 and mult2 are multiplication of each element of an array

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,1,2,3,4};
        boolean result=permutation(array1,array2);
        System.out.println("Permutation =>"+result);
    }

    public static boolean permutation(int array1[],int array2[]){
        boolean permutationFlag=false;
        int sum1=0,sum2=0;
        long mul1=1,mul2=1;
        for(int val:array1){
            sum1+=val;
            mul1*=val;
        }
        for(int val:array2){
            sum2+=val;
            mul2*=val;
        }
        if(sum1==sum2 && mul1==mul2){
            permutationFlag=true;
        }
        return permutationFlag;
    }
}
