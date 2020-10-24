
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omkar
 */
public class IOU {
    private HashMap<String, Double> hm;
    
    public IOU() {
        hm = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        hm.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return hm.getOrDefault(toWhom, 0.0);
    }
}
