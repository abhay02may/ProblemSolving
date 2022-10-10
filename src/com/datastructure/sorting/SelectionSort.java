package com.datastructure.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={8,1,2,8,1,9,6,5,7,10,4,3};
        System.out.println("Before Sorting \n");
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("\n After Sorting \n");
        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSort(int arr[]){
        int smallestIndex=0;
        for(int i=0;i< arr.length-2;i++){
            smallestIndex=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[smallestIndex]){
                    smallestIndex=j;
                }
            }
            if(arr[i]>arr[smallestIndex]){
                int temp=arr[i];
                arr[i]=arr[smallestIndex];
                arr[smallestIndex]=temp;
            }
        }
    }
}
