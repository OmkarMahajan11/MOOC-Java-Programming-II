
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<String> l = new ArrayList<>();
        
        while (true) {
            String s = scanner.next();
            if (s.equals("end")) {
                break;
            }
            l.add(s);
        }
        
        double avg = l.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();
        System.out.println("average of the numbers: " + avg);
    }
}
