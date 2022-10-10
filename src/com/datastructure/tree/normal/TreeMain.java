package com.datastructure.tree.normal;

public class TreeMain {
    public static void main(String[] args) {
        TreeNode drinks=new TreeNode("drinks");
        TreeNode hotDrinks=new TreeNode("hotDrinks");
        TreeNode coldDrinks=new TreeNode("coldDrinks");

        TreeNode tea=new TreeNode("tea");
        TreeNode coffee=new TreeNode("coffee");

        TreeNode pepsi=new TreeNode("pepsi");
        TreeNode fanta=new TreeNode("fanta");

        drinks.addChildren(hotDrinks);
        drinks.addChildren(coldDrinks);
        hotDrinks.addChildren(tea);
        hotDrinks.addChildren(coffee);
        coldDrinks.addChildren(pepsi);
        coldDrinks.addChildren(fanta);
        System.out.println(drinks.print(0));

    }
}
