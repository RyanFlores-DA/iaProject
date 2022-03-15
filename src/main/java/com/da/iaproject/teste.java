
package com.da.iaproject;

import java.util.Random;

public class teste {
    public static void main(String[] Args){
        
        Tree tree = new Tree();
        Tree tree2 = new Tree();
        Tree tree3 = new Tree();
        int value;
        Random randomNumber = new Random();
        
        System.out.println("Inserindo valores: ");
        
        
//        for(int i = 1; i<=10; i++){
//            value = randomNumber.nextInt(100);
//            System.out.print(value + " ");
//            tree.insertNode(value);
//        }
        tree.insertNode(140);
        tree.insertNode(80);
        tree.insertNode(97);
        tree.insertNode(101);
        
        tree2.insertNode(75);
        tree2.insertNode(71);
        tree2.insertNode(151);
        tree2.insertNode(99);
        tree2.insertNode(211);
        
        tree3.insertNode(140);
        tree3.insertNode(99);
        tree3.insertNode(211);
        
        
        
        System.out.println("\n\nBusca a esquerda");
        tree.preorderTraversal();
        
        System.out.println("\n\nBusca a esquerda");
        tree2.preorderTraversal();
        
        System.out.println("\n\nBusca a esquerda");
        tree3.preorderTraversal();
        
//        System.out.println("\n\nInorder traversal");
//        tree.inorderTraversal();
//        
//        System.out.println("\n\nPostorder traversal");
//        tree.postorderTraversal();
//        System.out.println("");
        
    }
}
