
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
public class TodoList {
    private ArrayList<String> l;
    
    public TodoList() {
        l = new ArrayList<>();
        l.add(null); //to matchup index in list with task number
    }
    
    public void add(String t) {
        l.add(t);
    }
    
    public void print() {
        for (int i = 1; i < l.size(); i++) {
            System.out.println(i + ": " + l.get(i));
        }
    }
    
    public void remove(int n) {
        l.remove(n);
    }
}
