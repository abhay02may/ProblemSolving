package com.datastructure.hashing.directchaining;

import java.util.LinkedList;

public class DirectChaining {
    LinkedList<String>[] hashTable;
    int maxChainSize=10;

    DirectChaining(int size){
        hashTable=new LinkedList[size];
    }

    public int modASCIIHashFunction(String word, int noOfCells){
        char charArray[]=word.toCharArray();
        int sum=0;
        for(int i=0;i<charArray.length;i++){
            sum+=charArray[i];
        }
        return sum % noOfCells;
    }

    public void insertToHashTable(String word){
        int newIndex=modASCIIHashFunction(word,hashTable.length);
        if(hashTable[newIndex]==null){
            hashTable[newIndex]=new LinkedList<>();
        }
        hashTable[newIndex].add(word);
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
        int newIndex=modASCIIHashFunction(word,hashTable.length);
        if(hashTable[newIndex]!=null && hashTable[newIndex].contains(word)){
            System.out.println("\n word '"+word+"' found in the hashTable at index : "+newIndex);
            return true;
        }else {
            System.out.println("\n word '"+word+"' not found in the hashTable ");
            return false;
        }
    }

    public void delete(String word){
        int newIndex=modASCIIHashFunction(word,hashTable.length);
        boolean wordFound=search(word);
        if(wordFound){
            hashTable[newIndex].remove(word);
            System.out.println("\n word '"+word+"' deleted from the hashTable ");
        }else{
            System.out.println("\n word '"+word+"' not found in the hashTable ");
        }
    }
}
