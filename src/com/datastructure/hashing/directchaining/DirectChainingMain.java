package com.datastructure.hashing.directchaining;

public class DirectChainingMain {
    public static void main(String[] args) {
        DirectChaining directChaining=new DirectChaining(13);
        directChaining.insertToHashTable("The");
        directChaining.insertToHashTable("Quick");
        directChaining.insertToHashTable("brown");
        directChaining.insertToHashTable("fox");
        directChaining.insertToHashTable("over");

        directChaining.displayHashTable();
        directChaining.search("fox");
        directChaining.delete("over");
        directChaining.search("over");

    }
}
