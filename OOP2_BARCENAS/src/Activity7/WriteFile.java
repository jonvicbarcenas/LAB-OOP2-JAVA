/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity7;

import java.util.*;
import java.io.*;
/**
 *
 * @author L12X17W07
 */

class WriteToFile implements FileHandling{
    private String fileName = "file.txt";
    @Override
    public void writeFile(){
        //Write
        try{
            File file = new File(this.fileName);
            try (FileWriter fw = new FileWriter(file, true)) {
                Scanner scanner = new Scanner(System.in);
                String line;
                System.out.println("Enter text to write to file (type 'exit' to stop)");
                boolean isFlag = true;
                while(isFlag){
                    line = scanner.nextLine();
                    if("exit".equalsIgnoreCase(line)) {
                        break;
                    }
                    fw.write(line);
                    fw.write("\n");
                    
                }
                System.out.println("Text Written to the file");
            }
        }catch(IOException e){
            System.out.print("Error: " + e);
        }
    }
}