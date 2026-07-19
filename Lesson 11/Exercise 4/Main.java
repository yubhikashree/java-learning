import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<Boolean> completed = new ArrayList<>();
        String loopCondition = "true";
        while(loopCondition.equals("true")){
            System.out.println("===== To-Do List Manager =====");
            System.out.println("1. Add task");
            System.out.println("2. View all tasks");
            System.out.println("3. Mark task as done");
            System.out.println("4. Remove task");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    completed.add(false);
                    System.out.println("Task added.");
                    break;
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            String status = completed.get(i) ? "✓" : "✗";
                            System.out.println((i + 1) + ". [" + status + "] " + tasks.get(i));
                        }
                    }
                    break;
                case 3:
                     if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.print("Enter task number to mark as done: ");
                        int index = sc.nextInt();
                        if (index >= 1 && index <= tasks.size()) {
                            completed.set(index - 1, true);
                            System.out.println("Task marked as done.");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;
                case 4:
                     if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.print("Enter task number to remove: ");
                        int index = sc.nextInt();
                        if (index >= 1 && index <= tasks.size()) {
                            tasks.remove(index - 1);
                            completed.remove(index - 1);
                            System.out.println("Task removed.");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    loopCondition = "false";
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            System.out.println();
        }
    }
}