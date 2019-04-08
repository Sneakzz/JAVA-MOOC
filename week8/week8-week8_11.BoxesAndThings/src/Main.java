/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenny
 */
public class Main {
    
    public static void main(String[] args) {
        // testing Book class
        Book book1 = new Book("Fedor Dostojevski", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);
        
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        // testing CD class
        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);
        
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);
        System.out.println();
        
        // testing Box class
        Box box = new Box(10);
        
        box.add(new Book("Fedor Dostojevski", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));
        
        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
        
        System.out.println(box);
        System.out.println();
        
        // testing boxes in boxes
        Box box2 = new Box(3);
        box2.add(new Book("writer1", "book1", 1));
        box2.add(new Book("writer2", "book2", 1.5));
        
        // adding the second box to the first one
        box.add(box2);
        System.out.println(box);
    }
}
