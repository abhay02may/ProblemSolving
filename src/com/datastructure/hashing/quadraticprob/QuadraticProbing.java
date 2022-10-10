package com.datastructure.hashing.quadraticprob;

import java.util.ArrayList;

public class QuadraticProbing {
    String [] hashTable;
    int usedCellNumber;

    QuadraticProbing(int size){
        hashTable=new String[size];
        usedCellNumber=0;
    }

    public int modASCIIHashFunction(String word,int noOfCells){
        int sum=0;
        for(int i=0;i<word.length();i++){
            sum+=word.charAt(i);
        }
        return sum % noOfCells;
    }

    public double loadFactor(){
        double loadFactor=usedCellNumber + 1.0/hashTable.length;
        return  loadFactor;
    }

    public void rehash(String word){
        usedCellNumber=0;
        ArrayList<String> dataList=new ArrayList<>();
        for(String str:hashTable){
            if(str!=null){
                dataList.add(str);
            }
        }
        dataList.add(word);
        hashTable=new String[2*hashTable.length];
        for(String str: dataList){
            insertToHashTable(str);
        }
    }

    public void insertToHashTable(String word){
        double loadFactor=loadFactor();
        if(loadFactor>=0.75){
            rehash(word);
        }else{
            int counter=0;
            int index=modASCIIHashFunction(word,hashTable.length);
            for(int i=index;i<index+hashTable.length;i++){
                int newIndex=(i+counter*counter) % hashTable.length;
                if(hashTable[newIndex]==null){
                    hashTable[newIndex]=word;
                    System.out.println(word+" has been inserted into hash table !!!!");
                    return;
                }else{
                    System.out.println("index "+newIndex+" already occupied , trying next one.... ");
                }
                counter++;
            }
        }
        usedCellNumber++;
    }

    public void displayHashTable(){
       if(hashTable==null){
           System.out.println("hash table is empty. nothing to display !!!");
           return;
       }else{
           for(int i=0;i<hashTable.length;i++){
               System.out.println("Index : "+i+", key : "+hashTable[i]);
           }
       }
    }

    public boolean search(String word){
        int index=modASCIIHashFunction(word,hashTable.length);
        for(int i=index;i<index+hashTable.length;i++){
            int newIndex=i %hashTable.length;
            if(hashTable[newIndex]!=null && hashTable[newIndex].equals(word)){
                System.out.println(word+" found in the hash table at index "+newIndex);
                return true;
            }
        }
        System.out.println(word+" not found in the hash table ");
        return false;
    }

    public void delete(String word){
        int index=modASCIIHashFunction(word,hashTable.length);
        for(int i=index;i<index+hashTable.length;i++){
            int newIndex=i%hashTable.length;
            if(hashTable[newIndex]!=null && hashTable[newIndex].equals(word)){
                hashTable[newIndex]=null;
                System.out.println(word+" deleted from the hashtable !!!!");
                return;
            }
        }
        System.out.println(word+" not found in the hashtable !!!!");
    }
}
