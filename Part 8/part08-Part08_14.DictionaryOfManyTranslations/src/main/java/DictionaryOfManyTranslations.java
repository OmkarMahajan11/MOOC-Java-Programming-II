
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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> hm;
    
    public DictionaryOfManyTranslations() {
        hm = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        hm.putIfAbsent(word, new ArrayList());
        hm.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        return hm.getOrDefault(word, new ArrayList());
    }
    
    public void remove(String word) {
        hm.remove(word);
    }
}
