/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omkar
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory h;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        h = new ChangeHistory();
        h.add(initialBalance);
    }
    
    public String history() {
        return h.toString();
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        h.add(this.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double b = super.takeFromWarehouse(amount);
        h.add(this.getBalance());
        return b;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + h.maxValue());
        System.out.println("Smallest amount of product: " + h.minValue());
        System.out.println("Average: " + h.average());
    }
}
