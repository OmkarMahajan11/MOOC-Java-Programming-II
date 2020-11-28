
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omkar
 */
public class Pipe<T> {
    
    private List<T> l;
    
    public Pipe() {
        l = new ArrayList<T>();
    }
    
    public void putIntoPipe(T value) {
        l.add(value);
    }
    
    public T takeFromPipe() {
        if (l.isEmpty()) {
            return null;
        }
        return l.remove(0);
    }
    
    public boolean isInPipe() {
        return !l.isEmpty();
    }
}
