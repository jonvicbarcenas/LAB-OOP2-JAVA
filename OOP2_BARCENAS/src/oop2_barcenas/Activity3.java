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


public class Activity3 {
    private String name;
    private int age;
    private String motto;
    
    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public void setMotto(String motto){
        this.motto = motto;
    }
    
    //getters
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }

    public String getMotto(){
        return motto;
    }
    
    public static void main(String args[]){
        Activity3 act = new Activity3();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        act.setName(name);
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        act.setAge(age);
        
        sc.nextLine();
        System.out.print("Enter motto: ");
        String motto = sc.nextLine();
        act.setMotto(motto);
        
        
        System.out.println("name: "+ act.getName());
        System.out.println("age: "+ act.getAge());
        System.out.println("motto: "+ act.getMotto());
    }
}
