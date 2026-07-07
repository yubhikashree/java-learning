public class Main{
    public static void main(String[] args){
        int even = 0;
        int odd = 0;
        for (int i=1 ; i<=20 ; i++){
            if (i%2==0) {
                System.out.println(i + "- Even");
                even = even + 1;
        }   else{
                System.out.println(i + "- Odd");
                odd = odd + 1;
        }
        }
        System.out.println("Total Even = " + even);
        System.out.println("Total Odd = " + odd);

    }
}