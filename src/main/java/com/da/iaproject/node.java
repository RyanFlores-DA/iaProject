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
public class node {
    node leftNode;
    int data;
    node rightNode;
    
    public node(int nodeData){ // construtor para inicializar os dados dos nós
        data = nodeData;
        leftNode = rightNode = null; // para se n tiver nenhum nó filho
    }
    
    public void insert(int insertValue){
        if(insertValue <data){
            if(leftNode == null){
                leftNode = new node(insertValue);
            }else leftNode.insert(insertValue);
        } else if (insertValue > data){
            if (rightNode == null){
                rightNode = new node(insertValue);
            }else rightNode.insert(insertValue);
        }
    }
}
