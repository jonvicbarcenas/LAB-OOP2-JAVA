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
public class Activity7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        try {
            while (choice != 3) {
                System.out.println("Press 1 to read from a file");
                System.out.println("Press 2 to write to a file");
                System.out.println("Press 3 to exit");
                System.out.print("Enter Choice: ");

                if (!sc.hasNextInt()) {
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    sc.nextLine();
                    continue;
                }

                choice = sc.nextInt();
                
                switch (choice){
                    case 1 -> {
                        ReadFile rf = new ReadFile();
                        rf.ReadFile();
                    }
                    case 2 -> {
                        WriteToFile wf = new WriteToFile();
                        wf.writeFile();
                    }
                    case 3 -> System.out.println("Exiting program.");
                    default -> System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                }
            }
        } finally {
            sc.close();
        }
    }
}

