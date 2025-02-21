/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acitivity5;

/**
 *
 * @author L12X17W07
 */
import java.util.*;
public class Activity5 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Dog objDog = new Dog();
        objDog.makeSound();
        
        Cat objCat = new Cat();
        objCat.makeSound();
        boolean isEnabled = true;
        int age = 0;
        while(isEnabled){
            try{
                System.out.print("Enter cat age: ");
                age = sc.nextInt();
                objCat.setAge(age);
                isEnabled = false;
            }catch(Exception e){
                System.out.println("Invalid input error: " + e);
                sc.next();
            }
        }
        
//        objCat.setAge(3);
        System.out.println("The cat age is: "+ objCat.getAge());
    }
}
