/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.da.iaproject;

/**
 *
 * @author Ryan Flores
 */
public class Tree {
    private node root;
    
    public Tree(){
        root = null;
    }
    
    public void insertNode(int insertValue){
        if(root == null){
            root = new node(insertValue); // cria o nó raiz ou nó inicial
        }else{
            root.insert(insertValue);
        }
    }
        
        public void preorderTraversal(){
            preorderHelper(root);
        }
        
        private void preorderHelper(node n){
            if(n == null){
                return;
            }
            System.out.printf("%d ", n.data);
            preorderHelper(n.leftNode);
            preorderHelper(n.rightNode);
            
        }
        
        public void inorderTraversal(){
            inorderHelper(root);
        }
        
        public void inorderHelper(node n){
            if(n == null){
                return;
            }
            
            inorderHelper(n.leftNode);
            System.out.printf("%d ", n.data);
            inorderHelper(n.rightNode);
            
            
            
        }
        public void postorderTraversal(){
            postorderHelper(root);
        }
        
        private void postorderHelper(node n){
            if(n == null){
                return;
            }
            
            postorderHelper(n.leftNode);
            postorderHelper(n.rightNode);
            System.out.printf("%d ", n.data);
        }
   }

