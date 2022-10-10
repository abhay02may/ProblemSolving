package com.datastructure.trie;

public class TrieMain {
    public static void main(String[] args) {
        Trie trie=new Trie();
        trie.insert("API");
        trie.insert("APIS");
        trie.search("APIS");
        trie.delete("APIS");
        trie.search("APIS");


    }
}
