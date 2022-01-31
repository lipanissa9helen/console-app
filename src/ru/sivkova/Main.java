package ru.sivkova;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Task> todolist = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            Scanner console = new Scanner(System.in);
            System.out.println("ENTER COMMAND: ");
            String a = console.nextLine();
            if (a.equals("create_task")) {
                Scanner console1 = new Scanner(System.in);
                System.out.println("ENTER TASK NAME: ");
                String name = console1.nextLine();
                Scanner console2 = new Scanner(System.in);
                System.out.println("ENTER TASK DESCRIPTION: ");
                String description = console2.nextLine();
                Task task = new Task(name, description);
                todolist.add(task);
            }
            else if(a.equals("list_tasks")) {
                for(int i = 0; i < todolist.size(); i++) {
                    System.out.println("TASK[id:" + (i + 1) +", " + todolist.get(i) +"]");
                }
            }
            else if(a.equals("delete_task")) {
                Scanner console3 = new Scanner(System.in);
                System.out.println("ENTER TASK ID: ");
                int id = console3.nextInt();
                todolist.remove(id);
            }
            else if(a.equals("exit")) {
                System.exit(0);
            }
            else {
                System.out.println("UNKNOWN COMMAND");
            }
        }
    }
}














