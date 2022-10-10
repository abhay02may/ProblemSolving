package normal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FirstSecond {

    public static void main(String[] args) {
        int myArray[] = {84,85,86,99,85,90,85,83,23,45,84,1,2,0};
        String firstSecond=firstSecond(myArray);
        System.out.println(firstSecond);
        int firstHighest=0;
        firstHighest = IntStream.of(myArray).max().getAsInt();
        int secondHighest=Arrays.stream(myArray).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("firstHighest : "+firstHighest+" secondHighest : "+secondHighest);

    }

    static String firstSecond(int[] myArray) {
        int first=myArray[0];
        int second=myArray[0];
        for(int i=0;i<myArray.length;i++){
            if(myArray[i]>first){
                second=first;
                first=myArray[i];
            }
            if(myArray[i]<first && myArray[i]>second){
                second=myArray[i];
            }
        }
        return first+" "+second;
    }

}
