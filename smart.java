import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("   SMART TASK & PRODUCTIVITY ANALYZER   ");
        System.out.println("==========================================");

        System.out.println("1. Add Task");
        System.out.println("2. View Task");
        System.out.println("3. Exit");
        System.out.println();

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("You chose: Add Task");
        } else if (choice == 2) {
            System.out.println("You chose: View Task");
        } else if (choice == 3) {
            System.out.println("Thank you! Goodbye 👋");
        } else {
            System.out.println("Invalid choice! Please try again.");
        }

        sc.close();
    }
}
