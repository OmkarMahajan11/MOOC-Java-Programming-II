
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omkar
 */
public class UserInterface {
    private Scanner sc;
    private TodoList l;
    
    public UserInterface(TodoList l, Scanner sc) {
        this.sc = sc;
        this.l = l;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = sc.nextLine();
            if (command.equals("stop")) {
                break;
            }
            commandProcessor(command);
        }
    }
    
    private void commandProcessor(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            list();
        } else if (command.equals("remove")) {
            remove();
        }
    }
    
    private void add() {
        System.out.println("To add: ");
        l.add((sc.nextLine()));
    }
    
    private void list() {
        l.print();
    }
    
    private void remove() {
        System.out.println("Which one is to be removed? ");
        l.remove(Integer.valueOf(sc.nextLine()));
    }
}
