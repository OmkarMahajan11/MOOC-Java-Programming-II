
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
public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        history = new ArrayList<>();
    }
    
    public void add(double status) {
        history.add(status);
    }
    
    public void clear() {
        history = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        return history.toString();
    }
    
    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }
        
        double res = 0.0;
        for (double i : history) {
            if (res < i) {
                res = i;
            }
        }
        return res;
    }
    
    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }
        
        double res = Integer.MAX_VALUE;
        for (double i : history) {
            if (res > i) {
                res = i;
            }
        }
        return res;
    }
    
    public double average() {
        if (history.isEmpty()) {
            return 0;
        }
        
        double sum = 0;
        for (double i : history) {
            sum += i;
        }
        return sum / history.size();
    }
}
