import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String name = sc.nextLine();
        System.out.print("Enter maths mark: ");
        int maths = sc.nextInt();
        System.out.print("Enter physics marks: ");
        int physics = sc.nextInt();
        System.out.print("Enter chemistry marks: ");
        int chemistry = sc.nextInt();
        int total = maths + physics + chemistry ;
        double avg = (double)(Total)/3;
        System.out.println("Student: "+name);
        System.out.println("Total: "+Total+"/300");
        System.out.println("Average: "+avg+"%");
    }
}
