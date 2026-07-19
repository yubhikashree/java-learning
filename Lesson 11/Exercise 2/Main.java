import java.util.ArrayList;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(34);
        numbers.add(67);
        numbers.add(12);
        numbers.add(89);
        numbers.add(45);
        numbers.add(23);
        numbers.add(78);
        numbers.add(56);
        System.out.println("Original: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);
        System.out.println("Max: " + Collections.max(numbers) + " | Min: " + Collections.min(numbers));
        for(int i=(numbers.size()-1) ; i>=0 ; i--){
            if (numbers.get(i) < 40){
                numbers.remove(i);
            }
        }
        System.out.println("After removing below 40: " + numbers);
        System.out.println("Final size: " + numbers.size());
    }
}
