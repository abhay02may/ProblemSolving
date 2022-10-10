package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CheckIndex {
    public static void main(String[] args) {

        CheckIndex obj=new CheckIndex();
        int arr[]={1,2,3,5,6,1,6,2};
        int firstIndex=obj.checkFirstIndex(arr,8,2,0);
        System.out.println("firstIndex : "+firstIndex);

        int lastIndex=obj.checkLastIndex(arr,8,1,7);
        System.out.println("lastIndex : "+lastIndex);

        obj.printAllPosition(arr,8,2,0);

        AtomicInteger count=new AtomicInteger(0);
        obj.countOccurence(arr,8,5,0,count);
        System.out.println("count : "+count);

        int occurCount=obj.countOccurence2(arr,8,1,0);
        System.out.println("occurCount : "+occurCount);

        List<Integer> list=new ArrayList<>();
        obj.storeAllPosition(arr,8,1,0,list);
        System.out.println("list : "+list);


    }

    public int checkFirstIndex(int arr[],int n, int key, int index){
        if(index==n){
            return -1;
        }
        if(arr[index]==key){
            return index;
        }
        return checkFirstIndex(arr,n-1,key,index+1);
    }

    public  int checkLastIndex(int arr[],int n, int key, int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==key){
            return index;
        }
        return checkLastIndex(arr,n-1,key,index-1);
    }

    public void countOccurence(int arr[],int n,int key, int index,AtomicInteger count){
        if(index==n){
            return;
        }
        if(arr[index]==key){
            count.set(count.intValue()+1);
        }
        countOccurence(arr,n,key,index+1,count);
    }

    public int countOccurence2(int arr[],int n,int key, int index){
        if(index==n){
            return 0;
        }
        if(arr[index]==key){
            return 1+ countOccurence2(arr,n,key,index+1);
        }else{
            return countOccurence2(arr,n,key,index+1);
        }
    }

    public void printAllPosition(int arr[],int n,int key, int index){
        if(index==n){
            return;
        }
        if(arr[index]==key){
            System.out.println("Element : "+key+" found at index : "+index);
        }
        printAllPosition(arr,n,key,index+1);
    }

    public void storeAllPosition(int arr[],int n, int key,int index,List<Integer> list){
        if(index==n){
              return ;
        }
        if(arr[index]==key){
            list.add(index);
        }
       storeAllPosition(arr,n,key,index+1,list);
    }
}
