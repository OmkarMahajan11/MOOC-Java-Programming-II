
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        
        ArrayList<String> l = new ArrayList<>();
        
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("end")) {
                break;
            }
            l.add(s);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String a = scanner.next();
        
        double avg = l.stream().mapToInt(i -> Integer.valueOf(i))
                .filter(i -> filterFunction(i, a))
                .average()
                .getAsDouble();
        
        if (a.equals("n")) {
            System.out.println("Average of the negative numbers: " + avg);
        } else {
            System.out.println("Average of the positie numbers: " + avg);
        }
    }
    
    public static boolean filterFunction(int i, String a) {
        if (a.equals("n")) {
            return i < 0;
        } else {
            return i > 0;
        }
    }
}
