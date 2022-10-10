package com.datastructure.hashing.quadraticprob;

import com.datastructure.hashing.linerarprob.LinearProbing;

public class QuadraticProbingMain {
    public static void main(String[] args) {
        QuadraticProbing quadraticProbing=new QuadraticProbing(13);
        quadraticProbing.insertToHashTable("The");
        quadraticProbing.insertToHashTable("quick");
        quadraticProbing.insertToHashTable("brown");
        quadraticProbing.insertToHashTable("fox");
        quadraticProbing.insertToHashTable("over");
        quadraticProbing.insertToHashTable("lazy");
        quadraticProbing.displayHashTable();
        quadraticProbing.search("lazy");
        quadraticProbing.delete("lazy");
        quadraticProbing.search("lazy");
    }
}
