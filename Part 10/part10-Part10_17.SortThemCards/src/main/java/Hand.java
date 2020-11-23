
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omkar
 */
public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cards;
    
    public Hand() {
        cards = new ArrayList<>();
    }
    
    public void add(Card c) {
        cards.add(c);
    }
    
    public void print() {
        cards.forEach(c ->{
            System.out.println(c);
        });
    }
    
    public void sort() {
        Collections.sort(cards);
    }
    
    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
    
    public int totalValue() {
        return cards.stream()
                .mapToInt(c -> c.getValue())
                .sum();
    }
    
    @Override
    public int compareTo(Hand h) {
        return this.totalValue() - h.totalValue();
    }
}
