import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        int[] marks = new int[5];
        for (int i=0 ; i<5 ; i++){
            System.out.print("Enter name of student " + (i+1) + ": ");
            names[i] = sc.nextLine();
        }
        for (int j=0 ; j<5 ; j++){
            System.out.print("Enter marks of " + names[j] + ": ");
            marks[j] = sc.nextInt();
        }
        System.out.println("--- Student Report ---");
        for (int k=0 ; k<5 ; k++){
            System.out.println(k+1 + ". " + names[k] + " - " + marks[k]);
        }
        int maxIndex = 0;
        for (int l=1 ; l<5 ;l++){
            if(marks[l]>marks[maxIndex]){
                maxIndex = l;
            }
        }
        System.out.println("Topper: " + names[maxIndex] + " with " + marks[maxIndex] + " marks.");
    }
}