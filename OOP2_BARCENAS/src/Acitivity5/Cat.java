/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acitivity5;

/**
 *
 * @author L12X17W07
 */
public class Cat extends Animal implements Animal2{
    private int age;
    
    @Override
    public void setAge(int age){
        this.age = age;
    }
    @Override
    public int getAge(){
        return age;
    }
    
    @Override
    public void makeSound(){
        System.out.println("Meow meow meow!");
    }
}
