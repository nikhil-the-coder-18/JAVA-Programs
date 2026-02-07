// February Mini Console Project #8
// Console-based ToDo List Manager
// Author: Nikhil Parmar

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        // 1. The Storage
        ArrayList<String> tasks = new ArrayList<>();
        Scanner ip = new Scanner(System.in);

        System.out.println("--- Welcome to the Task Manager ---");

        // 2. The Infinite Loop (The Engine)
        while(true) {
            System.out.println("\nSelect an Option: ");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Your Choice: ");

            int choice = ip.nextInt();
            ip.nextLine();

            // 3. The Logic Center
            if (choice == 1) {
                System.out.print("Enter Task: ");
                String task = ip.nextLine();
                tasks.add(task);
                System.out.println("Task Added!");
            }

            else if (choice == 2) {
                System.out.println("-----Your Tasks-----");
                for(int i=0; i< tasks.size(); i++) {
                    System.out.println((i+1) + ". " + tasks.get(i));
                }
            }

            else if (choice == 3) {
                System.out.print("Enter Task Number To remove: ");
                int index = ip.nextInt();

                if (index > 0 && index <= tasks.size()) {
                    tasks.remove(index - 1);
                    System.out.println("Task Removed!");
                } else  {
                    System.out.println("Invalid Number!");
                }
            }

            else if (choice == 4) {
                System.out.println("Bye Bye! ");
                break; //Stops the loop
            }
        }
    }
}
