package com.datastructure.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={8,1,2,8,1,9,6,5,7,10,4,3};
        System.out.println("Before Sorting \n");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("\n After Sorting \n");
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int arr[]){
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
}
