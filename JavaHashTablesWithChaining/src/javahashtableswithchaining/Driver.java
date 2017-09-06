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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // prime number to avoid collisions from common divisors
        HashTable nameTable = new HashTable();
        
        nameTable.put("Ben",21);
        nameTable.put("James",20);
        nameTable.put("Chris",40);
        nameTable.put("Luke",21);
        nameTable.put("Jay",5);
        nameTable.put("Rick",7);
        nameTable.put("Lori",7);
        
        
        System.out.println(nameTable.getAge("Tom"));
        System.out.println(nameTable.getAge("Ben"));
        System.out.println(nameTable.getAge("Luke"));
        System.out.println(nameTable.getAge("Jake"));
        System.out.println(nameTable.getAge("Jay"));
    
    }
    
   
    
}
