/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity9;

import java.util.InputMismatchException;

/**
 *
 * @author L12X17W07
 */
public class Activity9 {
    public static void main(String[] args){
        GenericClass<Integer, String> objOne = new GenericClass<>();

        int num = 0;
        while(true){
            try{
                objOne.setData1(num);
                break;
            }catch(InputMismatchException e){
                System.out.println("Invalid value! Error at : " + e);
            }
        }
        
        objOne.setData2("IT Rocks!");
        System.out.println("The value is " + objOne.getData1() + " and " + objOne.getData2());
    }
}
