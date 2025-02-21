/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filehandling;

import java.util.Scanner;

/**
 *
 * @author L12X17W07
 */
public class FileHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        try {
            ChildFileHandling crud = new ChildFileHandling("file.txt");
            while (choice != 5) {
                System.out.println("Press 1 - Add");
                System.out.println("Press 2 - Edit");
                System.out.println("Press 3 - Delete");
                System.out.println("Press 4 - Display");
                System.out.println("Press 5 - Exit");
                System.out.print("Enter Choice: ");

                if (!sc.hasNextInt()) {
                    System.out.println("Invalid input!");
                    sc.nextLine();
                    continue;
                }

                choice = sc.nextInt();
                
                switch (choice){
                    case 1 -> {
                        crud.add();
                        break;
                    }
                    case 2 -> {
                        crud.edit();
                        break;
                    }
                    case 3 -> {
                        crud.delete();
                        break;
                    }
                    case 4 -> {
                        crud.display();
                        break;
                    }
                    case 5 -> System.out.println("Good Bye!");
                    default -> System.out.println("Invalid Input!");
                }
            }
        } finally {
            sc.close();
        }
    }
}

