/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omkar
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
public class Employees {
 
    private List<Person> employees;
 
    public Employees() {
        employees = new ArrayList<>();
    }
 
    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }
 
    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(person -> Employees.this.add(person));
    }
 
    public void print() {
        Iterator<Person> iter = employees.iterator();
 
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
 
    }
 
    public void print(Education education) {
        Iterator<Person> iter = employees.iterator();
 
        while (iter.hasNext()) {
            Person person = iter.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }
 
    public void fire(Education education) {
        Iterator<Person> iter = employees.iterator();
 
        while (iter.hasNext()) {
            Person person = iter.next();
            if (person.getEducation() == education) {
                iter.remove();
            }
        }
 
    }
}
