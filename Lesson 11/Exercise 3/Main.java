import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");
        ArrayList<Student> students = new ArrayList<>();
        String choice = "yes";
        while (choice.equalsIgnoreCase("yes")){
            System.out.print("Add student? (yes/no): ");
            choice = sc.nextLine();
            if(choice.equalsIgnoreCase("yes")){
                System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter roll number: ");
            int rollNumber = sc.nextInt();
            System.out.print("Enter maths marks: ");
            double maths = sc.nextDouble();
            System.out.print("Enter physics marks: ");
            double physics = sc.nextDouble();
            System.out.print("Enter chemistry marks: ");
            double chemistry = sc.nextDouble();
            sc.nextLine();
            students.add(new Student(name, rollNumber, maths, physics, chemistry));
            }
        }
        System.out.println("===== REPORT CARDS =====");
        if (students.isEmpty()) {
            System.out.println("No students added.");
    }   else{
            Student topper = students.get(0);
    
        
        for(Student student : students){
            student.printReport();
            if (student.getAverage() > topper.getAverage()){
                topper = student;
            }
        }
    
        System.out.println("===========================");
        System.out.printf("Topper: %s with average %.2f%%\n",
                topper.getName(),
                topper.getAverage());
    }
    }
}