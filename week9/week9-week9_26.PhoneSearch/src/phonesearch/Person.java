/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonesearch;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Kenny
 */
public class Person implements Comparable<Person> {
    
    private String name;
    private Set<String> numbers = new HashSet<String>();
    private Address address;
    
    public Person(String name, String number) {
        this.name = name;
        this.numbers.add(number);
    }
    
    public Person(String name, String street, String city) {
        this.name = name;
        this.address = new Address(street, city);
    }
    
    public boolean nameEquals(String name) {
        return this.name.equals(name);
    }
    
    public boolean hasNumber(String number) {
        for (String num : this.numbers) {
            if (num.equals(number)) {
                return true;
            }
        }
        
        return false;
    }

    public String getName() {
        return name;
    }

    public Set<String> getNumbers() {
        return numbers;
    }

    public void addNumber(String number) {
        if (!this.numbers.contains(number)) {
            this.numbers.add(number);
        }
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(String street, String city) {
        if (this.address == null) {
            this.address = new Address(street, city);
        } else {
            this.address.setStreet(street);
            this.address.setCity(city);
        }
        
    }
    
    public void removeNumbers() {
        this.numbers.clear();
    }
    
    public void removeAddress() {
        this.address = null;
    }
    
    @Override
    public String toString() {
        String output = "";
        if (this.address == null && this.numbers.isEmpty()) {
            output += "  not found";
        } else if (this.address == null) {
            output += "  address unknown\n  phone numbers: \n";
            for (String num : this.numbers) {
                output += "   " + num + "\n";
            }
        } else if (this.numbers.isEmpty()) {
            output += "  address: " + this.address.toString() + "\n  phone number not found";
        } else {
            output += "  address: " + this.address.toString() + "\n  phone numbers \n";
            for (String num : this.numbers) {
                output += "   " + num + "\n";
            }
        }
        
        return output;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
}
