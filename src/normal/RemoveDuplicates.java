package normal;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[]={1, 1, 2, 2, 3, 4, 5};
        int arr2[]=removeDuplicates(arr);
        System.out.println(Arrays.toString(arr2));

    }

    public static int removeDuplicates(int arr[], int n) {
       int j=0;
       if(n==0|| n==1){
           return n;
       }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        arr[j++] = arr[n - 1];
        return j;
    }

    public static int[] removeDuplicates(int[] arr) {
        int result = removeDuplicates(arr, arr.length);
        int[] newArray = new int[result];
        for (int i = 0; i < result; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }
}
