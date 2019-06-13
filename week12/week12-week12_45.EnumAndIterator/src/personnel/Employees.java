/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Kenny
 */
public class Employees {
    
    private List<Person> people;
    
    public Employees() {
        this.people = new ArrayList<Person>();
    }
    
    public void add(Person person) {
        this.people.add(person);
    }
    
    public void add(List<Person> persons) {
        this.people.addAll(persons);
    }
    
    public void print() {
        // get the iterator for the list
        Iterator<Person> iterator = this.people.iterator();
        
        // use the iterator to go over each element in the list
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = this.people.iterator();
        
        while(iterator.hasNext()) {
            Person next = iterator.next();
            if(next.getEducation().equals(education)) {
                System.out.println(next);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = this.people.iterator();
        
        while(iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
