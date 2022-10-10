package com.datastructure.trie;

public class Trie {
    TrieNode root;
    public Trie(){
        root=new TrieNode();
        System.out.println("");
    }

    public void insert(String word){
        TrieNode currentNode=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            TrieNode node=currentNode.children.get(ch);
            if(node==null){
                node=new TrieNode();
                currentNode.children.put(ch,node);
            }
            currentNode=node;
        }
        currentNode.endOfString=true;
        System.out.println("Successfully Inserted "+word+" in Trie");
    }

    public boolean search(String word){
        TrieNode currentNode=root;
        for(char ch: word.toCharArray()){
            TrieNode node=currentNode.children.get(ch);
            if(node==null){
                System.out.println(word+" doesn't exists in TRIE");
                return false;
            }
            currentNode=node;
        }
        if(currentNode.endOfString==true){
            System.out.println(word+" exists in TRIE");
            return true;
        }else{
            System.out.println(word+" doesn't exists in TRIE, but it is prefix of another String");
        }
        return currentNode.endOfString;
    }

    private boolean delete(TrieNode parentNode,String word,int index){
        char ch=word.charAt(index);
        TrieNode currentNode=parentNode.children.get(ch);
        boolean canThisNodeBeDeleted=false;
        if(currentNode.children.size()>1){
            delete(currentNode,word,index+1);
            return false;
        }
        if(index==word.length()-1){
            if(currentNode.children.size()>1){
                currentNode.endOfString=false;
                return false;
            }else{
                parentNode.children.remove(ch);
                return true;
            }
        }
        if(currentNode.endOfString==true){
            delete(currentNode,word,index+1);
            return false;
        }
        canThisNodeBeDeleted=  delete(currentNode,word,index+1);
        if(canThisNodeBeDeleted){
            parentNode.children.remove(ch);
            return true;
        }else{
            return false;
        }
    }

    public void delete(String word){
        if(search(word)){
            delete(root,word,0);
        }
    }
}
