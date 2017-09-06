/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahashtableswithchaining;

/**
 *
 * @author Ben
 */
public class LinkedList {
    
    public LinkedList(){
     head = null;   
    }
    
    private class Node{
        
        public Node(String name, int age){
            this.name = name;
            this.age = age;
        }
        
        private int age;
        private String name;
        private Node nextLink;
    }
    
    private Node head;
    
    
    public void addNode(String name, int age){
        
        if(head == null){
            head = new Node(name,age);
        }
        else{
            Node link = head;
            head = new Node(name,age);
            head.nextLink = link;
        }

    }
    
    public int getAge(String name){
        
        Node link = head;
        if(link == null){
            return -1;
        }
        
        while(link != null){
            if(link.name.equals(name)){
                return link.age;
            }
            link = link.nextLink;
        }
        
        return -1;
        
    }
    
    
    
    
}
