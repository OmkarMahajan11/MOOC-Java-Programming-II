
import java.util.ArrayList;
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
public class StorageFacility {
    private HashMap<String, ArrayList<String>> hm;
    
    public StorageFacility() {
        hm = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        hm.putIfAbsent(unit, new ArrayList<>());
        hm.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return hm.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        hm.get(storageUnit).remove(item);
        if (hm.get(storageUnit).isEmpty()) {
            hm.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        return new ArrayList(hm.keySet());
    }
}
