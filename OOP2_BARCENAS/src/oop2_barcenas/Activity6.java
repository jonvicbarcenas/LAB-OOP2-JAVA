/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2_barcenas;

/**
 *
 * @author L12X17W07
 */
import java.util.*;
public class Activity6 {
    
    public static void main(String args[]){
        ArrayList<String> personName = new ArrayList<>();
        
        personName.add("JV");
        personName.add("Kai");
        personName.add("Cenat");

        personName.set(2, "Tophere Ware");
        
        personName.remove("JV");
        
        for(String names: personName){
            System.out.println(names);
        }
    }
}
