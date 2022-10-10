package com.datastructure.hashing.linerarprob;

import com.datastructure.hashing.directchaining.DirectChaining;

public class LinearProbingMain {
    public static void main(String[] args) {
        LinearProbing linearProbing=new LinearProbing(13);
        linearProbing.insertToHashTable("The");
        linearProbing.insertToHashTable("quick");
        linearProbing.insertToHashTable("brown");
        linearProbing.insertToHashTable("fox");
        linearProbing.insertToHashTable("over");
        linearProbing.displayHashTable();
        linearProbing.search("fox");
        linearProbing.delete("fox");
        linearProbing.search("fox");
    }
}
