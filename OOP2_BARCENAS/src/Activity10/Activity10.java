/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity10;
import java.util.*;
import java.text.DecimalFormat;

/**
 *
 * @author L12X17W07
 */
public class Activity10 {
    public static void main(String[] args){
        GenericClass<Double, Double> objOne= new GenericClass<>();
        DecimalFormat df = new DecimalFormat("#,###.00");
        Scanner sc = new Scanner(System.in);
        double num1 = 0, num2= 0;
        
        while(true){
            try{
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                objOne.setData1(num1);
                break;
            }catch(InputMismatchException e){
                System.out.println("Err setting data1" + e);
                sc.next();
            }
        }
        
        while(true){
            try{
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
                objOne.setData2(num2);
                break;
            }catch(Exception e){
                System.out.println("Err setting data2" + e);
                sc.next();
            }
        }
        
        
        System.out.println("The sum of the " + df.format(objOne.getData1()) + " and " + df.format(objOne.getData2()) + " is " + df.format(objOne.computeSum()));
        
        System.out.println("The difference of the " + df.format(objOne.getData1()) + " and " + df.format(objOne.getData2()) + " is " + df.format(objOne.difference()));
        
        System.out.println("The product of the " + df.format(objOne.getData1()) + " and " + df.format(objOne.getData2()) + " is " + df.format(objOne.product()));
        
        System.out.println("The quotient of the " + df.format(objOne.getData1()) + " and " + df.format(objOne.getData2()) + " is " + df.format(objOne.quotient()));
        
        System.out.println("The remainder of the " + df.format(objOne.getData1()) + " and " + df.format(objOne.getData2()) + " is " + df.format(objOne.remainder()));
    }
}
