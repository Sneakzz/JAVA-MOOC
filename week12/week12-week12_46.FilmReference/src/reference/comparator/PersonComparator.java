/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.*;
import reference.domain.Person;

/**
 *
 * @author Kenny
 */
public class PersonComparator implements Comparator<Person>{
    
    private Map<Person, Integer> persons;
    
    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.persons = peopleIdentities;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if(!this.persons.containsKey(o1) || !this.persons.containsKey(o2)) {
            return 0;
        }
        
        return this.persons.get(o2) - this.persons.get(o1);
    }
}
