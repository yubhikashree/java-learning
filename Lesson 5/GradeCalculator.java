import java.util.Scanner;
public class GradeCalculator {
    public static int getTotal(int m, int p, int c) {
        return m + p + c;
    }
    public static double getAverage(int total) {
        return (double)total / 3.0;
    }
    public static String getGrade(double avg) {
        if (avg >= 90) {
            return "A";
        } else if (avg >= 75) {
            return "B";
        } else if (avg >= 60) {
            return "C";
        } else if (avg >= 40){
            return "D";
        } else{
            return "F";
        }
    }
    public static String getResult(double avg) {
        if (avg >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
    public static void printReport(String name, int m, int p, int c) {
        int total = getTotal(m, p, c);
        double avg = getAverage(total);
        String grade = getGrade(avg);
        String result = getResult(avg);
        System.out.println("----- STUDENT REPORT -----");
        System.out.println("Name: " + name);
        System.out.println("Maths: " + m);
        System.out.println("Physics: " + p);
        System.out.println("Chemistry: " + c);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Maths Mark: ");
        int m = sc.nextInt();
        System.out.print("Enter Physics Mark: ");
        int p = sc.nextInt();
        System.out.print("Enter Chemistry Mark: ");
        int c = sc.nextInt();
        printReport(name, m, p, c);
    }
}  
