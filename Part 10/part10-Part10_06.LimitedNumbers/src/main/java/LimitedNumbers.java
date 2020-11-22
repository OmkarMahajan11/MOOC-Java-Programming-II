
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> l = new ArrayList<>(); 
        
        while (true) {
            int i = scanner.nextInt();
            if (i < 0) {
                break;
            }
            l.add(i);
        }
        
        l.stream().filter(i -> i >= 1 && i <= 5)
                .forEach(i -> {System.out.println(i);});                
    }
}
