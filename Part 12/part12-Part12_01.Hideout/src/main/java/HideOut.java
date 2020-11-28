/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omkar
 */
public class HideOut<T> {
    
    private T element;
    
    public void putIntoHideout(T toHide) {
        element = toHide;
    }
    
    public T takeFromHideout() {
        return element;
    }
    
    public boolean isInHideout() {
        return element != null;
    }
}
