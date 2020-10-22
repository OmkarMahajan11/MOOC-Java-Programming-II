
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
public class Abbreviations {
    HashMap<String, String> hm;
    
    public Abbreviations() {
        hm = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        hm.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return hm.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {
        return hm.get(abbreviation);
    }
}
