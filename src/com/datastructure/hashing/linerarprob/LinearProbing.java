package com.datastructure.hashing.linerarprob;

import java.util.ArrayList;

public class LinearProbing {
    String[] hashTable;
    int usedCellNumber;

    LinearProbing(int size){
        hashTable=new String[size];
        usedCellNumber=0;
    }

    public int modASCIIHashFunction(String word, int noOfCells){
        int sum=0;
        for(int i=0;i<word.length();i++){
            sum+=word.charAt(i);
        }
        return sum % noOfCells;
    }

    public double loadFactor(){
        double loadFactor=usedCellNumber *1.0/hashTable.length;
        return loadFactor;
    }

    public void rehashKeys(String word){
        usedCellNumber=0;
        ArrayList<String> dataList=new ArrayList<>();
        for (String str:hashTable){
            if(str!=null){
                dataList.add(str);
            }
        }
        dataList.add(word);
        hashTable=new String[hashTable.length *2];
        for (String value:dataList){
            insertToHashTable(word);
        }
    }

    public void insertToHashTable(String word){
        double loadFactor=loadFactor();
        if(loadFactor>=0.75){
            rehashKeys(word);
        }else{
            int index=modASCIIHashFunction(word,hashTable.length);
            for(int i=index;i<index+hashTable.length;i++){
                int newIndex=i % hashTable.length;
                if(hashTable[newIndex]==null){
                    hashTable[newIndex]=word;
                    System.out.println(word+" inserted at location "+newIndex);
                    break;
                }else{
                    System.out.println(newIndex+" index is already occupied, trying next empty index....");
                }
            }
        }
        usedCellNumber++;
    }

    public void displayHashTable(){
        if(hashTable==null){
            System.out.println("\n HasTable is empty !!!!");
            return;
        }else{
            System.out.println("---------HashTable---------------");
            for(int i=0;i<hashTable.length;i++){
                System.out.println("Index : "+i+", key: "+hashTable[i]);
            }
        }
    }

    public boolean search(String word){
        int index=modASCIIHashFunction(word,hashTable.length);
        for(int i=index;i<index+hashTable.length;i++){
            int newIndex=i%hashTable.length;
            if(hashTable[newIndex]!=null && hashTable[newIndex].equals(word)){
                System.out.println(word +" found in the hashTable at index "+newIndex);
                return true;
            }
        }
        System.out.println(word +" not found in the hashTable ");
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
