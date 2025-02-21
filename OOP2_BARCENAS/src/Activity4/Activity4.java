/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity4;

/**
 *
 * @author L12X17W07
 */
public class Activity4 {
    public static void main(String args[]){
        //parent class
        Parent parent = new Parent();
        parent.display();
        
        //child1 class
        Child1 child1 = new Child1();
        child1.display();
        
        //child2 class
        Child2 child2 = new Child2();
        child2.display();
        
        //method call
        show(5);
        show(25, 7);
        show("Jon Vic Barcenas", 20);
    }
    
    //Overloading
    public static void show(int num1){
        System.out.println("The number is "+ num1);
    }
    
    public static void show(int num1, int num2){
        System.out.println("The number are "+ num1 +" and "+ num2);
    }
    
    public static void show(String name, int age){
        System.out.println("The name is "+ name +" and age is "+ age);
    }
}
