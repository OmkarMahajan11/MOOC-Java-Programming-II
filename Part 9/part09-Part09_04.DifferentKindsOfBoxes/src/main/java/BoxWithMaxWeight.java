
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
public class BoxWithMaxWeight extends Box{
    private final int capacity;
    private int currWeight;
    private ArrayList<Item> l;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        currWeight = 0;
        l = new ArrayList<>();
    }
    
    @Override
    public void add(Item i) {
        if (currWeight + i.getWeight() > capacity) {
            return;
        }
        l.add(i);
        currWeight += i.getWeight();
    }
    
    @Override
    public boolean isInBox(Item i) {
        return l.contains(i);
    }
}
