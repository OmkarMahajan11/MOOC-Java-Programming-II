/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omkar
 */
public class Book implements Packable{
    private final String author;
    private final String name;
    private final double weight;
    
    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }
    
    @Override
    public double weight() {
        return weight;
    }
    
    @Override
    public String toString() {
        return author + ": " + name;
    }
}
