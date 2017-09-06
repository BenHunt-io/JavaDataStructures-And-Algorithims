/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabinarysearchtree;

import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinarySearchTree tree = new BinarySearchTree();
        
        String name = "";
        int age = 0;
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter an age for a person: ");
        age = scanner.nextInt();
        System.out.print("Enter a name for that person: ");
        name = scanner.next();
        while(age != -1){
            tree.addNode(name, age);
            System.out.print("Enter an age for a person: ");
            age = scanner.nextInt();
            System.out.print("Enter a name for that person: ");
            name = scanner.next();
        }
        
        tree.showElems();
    }
    
}
