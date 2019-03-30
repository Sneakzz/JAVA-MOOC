
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenny
 */
public class Phonebook {
    private ArrayList<Person> persons;
    
    public Phonebook() {
        this.persons = new ArrayList();
    }
    
    public void add(String name, String number) {
        this.persons.add(new Person(name, number));
    }
    
    public String searchNumber(String name) {
        String result = "";
        for (Person person : this.persons) {
            if(person.getName().equals(name)) {
                result = person.getNumber();
                break;
            } else {
                result = "number not known";
            }
        }
        return result;
    }
    
    public void printAll() {
        for (Person person : this.persons) {
            System.out.println(person);
        }
    }
}
