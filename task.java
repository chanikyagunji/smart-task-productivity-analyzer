import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("   SMART TASK & PRODUCTIVITY ANALYZER   ");
        System.out.println("==========================================");

        System.out.println("1. Add Task");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // clear line

        if (choice == 1) {

            Task task = new Task();

            System.out.print("Enter task name: ");
            task.name = sc.nextLine();

            System.out.print("Enter priority (High / Medium / Low): ");
            task.priority = sc.nextLine();

            System.out.print("Enter status (Pending / Done): ");
            task.status = sc.nextLine();

            System.out.println();
            System.out.println("✅ Task Added Successfully!");
            System.out.println("Task Name   : " + task.name);
            System.out.println("Priority    : " + task.priority);
            System.out.println("Status      : " + task.status);

        } else {
            System.out.println("Thank you! Goodbye 👋");
        }

        sc.close();
    }
}
