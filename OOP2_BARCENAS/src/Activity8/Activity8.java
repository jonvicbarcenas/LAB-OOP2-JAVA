/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity8;

/**
 *
 * @author L12X17W07
 */

public class Activity8 {
    public static void main(String[] args){
        Activity8 obj1 = new Activity8();
        obj1.display("Jon Vic Barcenas");
        obj1.display(20);
        obj1.display(512);
        obj1.display("T");
    }
    
    public<T> void display(T value){
        System.out.println("The value is " + value);
    }
}
