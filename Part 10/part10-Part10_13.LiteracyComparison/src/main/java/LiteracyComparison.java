
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try {
            Stream<String> stream = Files.lines(Paths.get("literacy.csv"));
            
            stream.map(s -> s.split(","))
                    .map(parts -> new Entry(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5]))
                    .sorted((e1, e2) -> {
                        return e1.compareTo(e2);
                    })
                    .forEach(e -> System.out.println(e));
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
