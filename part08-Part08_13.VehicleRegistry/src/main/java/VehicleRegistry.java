
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omkar
 */
public class VehicleRegistry {
    private HashMap <LicensePlate, String> hm;
    
    public VehicleRegistry() {
        hm = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (!"0".equals(hm.getOrDefault(licensePlate, "0"))) {
            return false;
        }
        
        hm.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        return hm.get(licensePlate);
    }
    
     public boolean remove(LicensePlate licensePlate) {
         return hm.remove(licensePlate) != null;
     }
     
     public void printLicensePlates() {
         hm.keySet().forEach((p) -> {
             System.out.println(p.toString());
        });
     }
     
     public void printOwners() {
         Set<String> hs = new HashSet<>(hm.values());
         hs.forEach((s) -> {
             System.out.println(s);
         });
     }
}
