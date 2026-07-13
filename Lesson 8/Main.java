import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];
        for (int i=0 ; i<n ; i++){
            System.out.println("Student " + (i+1) + ": ");
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
            students[i] = new Student(name, rollNumber, maths, physics, chemistry);
        }
        System.out.println("===== REPORT CARDS =====");
        Student topper = students[0];
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