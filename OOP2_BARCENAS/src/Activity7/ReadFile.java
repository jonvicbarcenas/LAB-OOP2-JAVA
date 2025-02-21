/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity7;

/**
 *
 * @author L12X17W07
 */
import java.util.*;
import java.io.*;
public class ReadFile {
    public void ReadFile(){
        //Read
        try{
            File file = new File("file.txt");
            Scanner scanFile = new Scanner(file);
            while(scanFile.hasNext()){
                System.out.println(scanFile.nextLine());
            }
        }catch(FileNotFoundException e){
            System.out.print("Error: " + e);
        }
    }
}
