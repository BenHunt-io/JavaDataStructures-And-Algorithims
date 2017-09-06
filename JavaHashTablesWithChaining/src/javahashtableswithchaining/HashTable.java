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
public class HashTable {
    
    private LinkedList[] hashTable;
    // prime number to avoid collions from common divisors
    private static final int SIZE =  13;
    
    public HashTable(){
        hashTable = new LinkedList[SIZE];
        for(int i = 0; i<SIZE; i++){
            hashTable[i] = new LinkedList();
        }
    }
    
    public void put(String name,int age){
        int index = computeHash(name);
        hashTable[index].addNode(name,age);
    }
    
    public int getAge(String name){
        int index = computeHash(name);
        int age = hashTable[index].getAge(name);
        return age;
    }
    
    /**
     * Computes hash by summing the strings characters and modulus by the 
     * size of the table
     * @param name
     * @return returns hashed value of a string
     */
    public int computeHash(String name){
        int sum = 0;
        for(int i = 0; i<name.length(); i++){
            sum += (int)name.charAt(i);
        }
        return sum % SIZE;
    }
    
    
}
