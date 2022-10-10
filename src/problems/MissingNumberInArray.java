package problems;

import java.util.stream.IntStream;

public class MissingNumberInArray {

    public static void main(String[] args) {
        int intArray[]={1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18,19,20};
        missingNumber(intArray);
    }

    public static void missingNumber(int[] intArray) {
        int sum1= IntStream.of(intArray).sum();
        //int sum1=IntStream.of(intArray).reduce(0,(a,b)->a+b);
        int sum2=20*(20+1)/2;
        System.out.println("Missing Number in Array is : "+(sum2-sum1));
    }

}
