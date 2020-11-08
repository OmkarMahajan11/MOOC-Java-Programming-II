
import java.util.HashMap;
import java.util.Map;
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
public class Warehouse {
    private Map<String, Integer> priceMap;
    private Map<String, Integer> stockMap;
    
    public Warehouse() {
        priceMap = new HashMap<>();
        stockMap = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        stockMap.put(product, stock);
        priceMap.put(product, price);
    }
    
    public int price(String product) {
        if (priceMap.containsKey(product)) {
            return priceMap.get(product);
        } else {
            return -99;
        }
    }
    
    public int stock(String product) {
        if (stockMap.containsKey(product)) {
            return stockMap.get(product);
        } else {
            return 0;
        }
    }
    
    public boolean take(String product) {
        if (!stockMap.containsKey(product)) {
            return false;
        } else if (stockMap.get(product) == 0) {
            return false;
        } else {
            int stock = stockMap.get(product);
            stockMap.put(product, stock - 1);
            return true;
        }
    }
    
    public Set<String> products() {
        return priceMap.keySet();
    }
}
