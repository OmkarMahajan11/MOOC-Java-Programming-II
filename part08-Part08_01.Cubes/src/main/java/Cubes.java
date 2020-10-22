
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String ip = scanner.nextLine();
            if (ip.equals("end")) {
                break;
            }
            
            int i = Integer.valueOf(ip);
            System.out.println(i*i*i);
        }
    }
}
