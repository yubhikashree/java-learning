import java.util.Scanner;
public class Main{
    public static String lengthCheck(String username){
        if (username.length() >= 6){
            return "PASS";
    }   else{
            return "FAIL";
    }
}   public static String spaceCheck(String username){
        if (username.contains(" ")){
            return "FAIL";
    }   else{
            return "PASS";
    }
}   public static String firstCharCheck(String username) {
    char first = username.charAt(0);
    if (first >= '0' && first <= '9') {
        return "FAIL";
    }
    return "PASS";
}   public static String caseCheck(String username) {
    for (int i = 0; i < username.length(); i++) {
        char c = username.charAt(i);
        if (c >= 'A' && c <= 'Z') {
            return "FAIL";  
        }
    }
    return "PASS";  
}  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        String lengthResult = lengthCheck(username);
        String spaceResult = spaceCheck(username);
        String firstResult = firstCharCheck(username);
        String caseResult = caseCheck(username);
        System.out.println("Length check: " + lengthResult);
        System.out.println("No spaces: " + spaceResult);
        System.out.println("Starts with letter: " + firstResult);
        System.out.println("All lowercase: " + caseResult);
        if (lengthResult.equals("PASS") && spaceResult.equals("PASS")
        && firstResult.equals("PASS") && caseResult.equals("PASS")) {
            System.out.println("Username accepted!");
    }   else {
            System.out.println("Username rejected!");
    }
}
}   
