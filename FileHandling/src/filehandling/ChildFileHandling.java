/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;
import java.io.*;
import java.util.*;

/**
 *
 * @author L12X17W07
 */
public class ChildFileHandling implements ParentFileHandling{
    private ArrayList<String> listString = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);
    private String fileName;
    
    public ChildFileHandling(String fileName){
        this.fileName = fileName;
        loadFile();
    }
    
    private void loadFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(this.fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                listString.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }
    
    @Override
    public void display() {
        try {
            File file = new File(fileName);
            Scanner scanFile = new Scanner(file);
            int index = 0; 

            System.out.println("The contents of the file: ");
            while (scanFile.hasNextLine()) {
                System.out.println(index + " - " + scanFile.nextLine());
                index++; 
            }
            scanFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    @Override
    public void add(){
        try{
            File file = new File(this.fileName);
            try (FileWriter fw = new FileWriter(file, false)) {
                Scanner scanner = new Scanner(System.in);
                String line;
                System.out.print("Enter value to add: ");
                line = scanner.nextLine();
                listString.add(line);
                try{
                    for (String str : listString) {
                        fw.write(str + "\n");
                    }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
                System.out.println("Value successfully added!");
            }
        }catch(IOException e){
            System.out.print("Error: " + e);
        }   
    }
    
    @Override
    public void edit(){
        try{
            int index;
            while(true){
                System.out.print("Enter index to update: ");
                index = sc.nextInt();
                if(sc.hasNextLine()){
                    sc.nextLine();
                }

                if (index < 0 || index >= listString.size()) {
                    System.out.println("Invalid index number!");
                    continue;
                }
                break;
            }
            
            System.out.print("Enter new value: ");
            String newValue = sc.nextLine();
            listString.set(index, newValue);
            
            update();
            
            System.out.println("Value successfully updated!");
              
        }catch(Exception e){
            System.out.print("Invalid index number!: ");
        }
    }
   

    @Override
    public void delete() {
        try {
            while (true) {
                System.out.print("Enter value to delete: ");
                String name = sc.nextLine();

                if (!listString.contains(name)) {
                    System.out.println("Value not found!");
                    continue; 
                }

                listString.remove(name); 

                update();

                System.out.println("Value successfully deleted!");
                break;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private void update(){
        try (FileWriter fw = new FileWriter(this.fileName, false)) {
            for (String str : listString) {
                fw.write(str + "\n");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
