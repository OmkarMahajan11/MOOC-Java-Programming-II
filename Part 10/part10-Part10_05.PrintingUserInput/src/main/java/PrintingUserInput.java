
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> l = new ArrayList<>();
        
        while(scanner.hasNext()) {
            l.add(scanner.next());
        }
        
        l.stream().forEach(i -> {
            System.out.println(i);
        });
    }
}
