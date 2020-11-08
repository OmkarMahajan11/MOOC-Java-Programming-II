
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omkar
 */
public class Box implements Packable{
    private final double capacity;
    private ArrayList<Packable> l;
    
    public Box(double maximumCapacity) {
        capacity = maximumCapacity;
        l = new ArrayList<>();
    }
    
    public void add(Packable p) {
        if (this.weight() + p.weight() < capacity) {
            l.add(p);
        }
    }
    
    @Override
    public double weight() {
        double weight = 0;
        for (Packable p : l) {
            weight += p.weight();
        }
        return weight;
    }
    
    @Override
    public String toString() {
        return "Box: " + l.size() + " items, total weight " + this.weight() + " kg";
    }
}
