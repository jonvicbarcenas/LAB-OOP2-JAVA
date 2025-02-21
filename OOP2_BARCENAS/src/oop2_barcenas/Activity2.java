/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2_barcenas;

/**
 *
 * @author L12X17W07
 */

import java.util.Scanner;
public class Activity2 {
    String name;
    int age;
    String motto;
    
    //constructor
    public Activity2(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Activity2 obj1 = new Activity2("Jon Vic Barcenas", 20);
//        System.out.println("The name is: "+ obj1.name);
//        System.out.println("The age is: "+ obj1.age);
        
        System.out.print("Input name: ");
        obj1.name = scanner.nextLine();
        

        System.out.print("Enter age: ");
        obj1.age = scanner.nextInt();
        
        scanner.nextLine();

        System.out.print("Input motto: ");
        obj1.motto = scanner.nextLine();
        
        
        
        System.out.println("name is: "+ obj1.name);
        System.out.println("age is: "+ obj1.age);
        System.out.println("motto: " + obj1.motto);
    }
    
    
    
}
