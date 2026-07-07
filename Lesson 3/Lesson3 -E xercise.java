import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks out of 100: ");
        int marks = sc.nextInt();
        if (marks >= 90){
            System.out.println("Grade: A");
            System.out.println("Outstanding!");
    }   else if(marks >= 75){
            System.out.println("Grade: B");
            System.out.println("Well Done!");
    }   else if(marks >= 60){
            System.out.println("Grade: C");
            System.out.println("Keep improving!");
    }   else if(marks >= 40){
            System.out.println("Grade: D");
            System.out.println("Work Harder!");
    }   else{
            System.out.println("Grade: F");
            System.out.println("Please see your teacher!");
    }   if (marks >= 40) {
            System.out.println("Result: Pass");
    }   else {
            System.out.println("Result: Fail");
    }
    }
}
