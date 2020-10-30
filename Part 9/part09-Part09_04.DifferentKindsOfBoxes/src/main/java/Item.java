
import java.util.Objects;


public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.name);
        return hash;
    }
    
    @Override
    public boolean equals(Object a) {
        if (a == this) {
            return true;
        }
        if (!(a instanceof Item)) {
            return false;
        }
        Item itema = (Item) a;
        
        return this.name.equals(itema.name);
    }
}
