/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2_barcenas;

/**
 *
 * @author L12X17W07
 */
import java.text.DecimalFormat;

public class Activity1 {
    
    double cash = 2175500.143;
    
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat("#,###.##");
        Activity1 obj1 = new Activity1();
        
        System.out.println("IT Rocks!");
        obj1.display();
        
        int i=0;
        do{ 
            obj1.display();
            i++;
        }while(i<10);
        
        System.out.println("The cash is: " + df.format(obj1.cash));
    }
    
    public void display(){
        System.out.println("Hello World!");
        
    }  
}
