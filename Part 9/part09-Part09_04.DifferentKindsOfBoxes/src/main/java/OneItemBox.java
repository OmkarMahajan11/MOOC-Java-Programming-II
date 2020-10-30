
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
public class OneItemBox extends Box{
    private ArrayList<Item> l;
    
    public OneItemBox() {
        l = new ArrayList<>();
    }
    
    @Override
    public void add(Item i) {
        if (l.isEmpty()) {
            l.add(i);
        }
    }
    
    @Override
    public boolean isInBox(Item i) {
        return l.contains(i);
    }
}
