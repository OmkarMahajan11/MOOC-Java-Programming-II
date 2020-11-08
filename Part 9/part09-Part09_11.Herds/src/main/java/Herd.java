
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
public class Herd implements Movable {
    private ArrayList<Movable> animals;
    
    public Herd() {
        animals = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        String s = "";
        s = animals.stream().map((i) -> i.toString() + "\n").reduce(s, String::concat);
        return s;
    }
    
    public void addToHerd(Movable movable) {
        animals.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        animals.forEach((i) -> {
            i.move(dx, dy);
        });
    }
}
