/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabinarysearchtree;

/**
 * Binary search tree implementation. Some recursive methods.
 * @author Ben
 */
public class BinarySearchTree {
    
    public BinarySearchTree(){
        root = null;
    }
    
    // Each "Node" of the binary tree. Basically each object of data that holds
    // references (links) to other nodes.
    private class Node{
        
        public Node(String name, int age){
            this.name = name;
            this.age = age;
        }
        
        private String name;
        private int age;
        private Node leftLink;
        private Node rightLink;
    }
    
    private Node root; // similar to how head works in LinkedLists
    
    
    public void addNode(String name, int age){
        root = insertNode(root,name,age);
    }
    
    /**
     * Inserts a Node that will satisfy the binary search tree
     * @param name part of a Node to be created
     * @param age part of a Node to be created
     * @param node pass in root to traverse the tree
     * @return reference to where the root should now point to. This is because
     * the root could be updated in the process of inserting a Node. This very
     * well could just point to the same reference as before and one of the other
     * Nodes gets updated
     */
    private Node insertNode(Node subTreeRoot, String name, int age){
        
       if(subTreeRoot == null){
           subTreeRoot = new Node(name,age);
       }
       else if(subTreeRoot.age > age){
           subTreeRoot.leftLink = insertNode(subTreeRoot.leftLink,name,age);
       }
       else if(subTreeRoot.age < age){
           subTreeRoot.rightLink = insertNode(subTreeRoot.rightLink,name,age);
       }
       
       return subTreeRoot;
    }
    /**
     * Displays elements - In-Order Traversal
     * Recursively
     */
    private void displayTree(Node subTreeRoot){
        
        if(subTreeRoot != null){
            displayTree(subTreeRoot.leftLink);
            System.out.println("Name: " + subTreeRoot.name + " Age: " + subTreeRoot.age);
            displayTree(subTreeRoot.rightLink);
        }
    }
    
    public void showElems(){
        displayTree(root);
    }
}

