/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.*;
import java.util.Map.Entry;
import reference.domain.*;

/**
 *
 * @author Kenny
 */
public class RatingRegister {
    
    private Map<Film, List<Rating>> filmRatings;
    private Map<Person, Map<Film, Rating>> personalRatings;
    
    public RatingRegister() {
        this.filmRatings = new HashMap<Film, List<Rating>>();
        this.personalRatings = new HashMap<Person, Map<Film, Rating>>();
    }
    
    public void addRating(Film film, Rating rating) {
        if(!this.filmRatings.containsKey(film)) {
            this.filmRatings.put(film, new ArrayList<Rating>());
        }
        this.filmRatings.get(film).add(rating);
    }
    
    public void addRating(Person person, Film film, Rating rating) {
        if(!this.personalRatings.containsKey(person)) {
            this.personalRatings.put(person, new HashMap<Film, Rating>());
        }
        
        this.personalRatings.get(person).put(film, rating);
        this.addRating(film, rating);
    }
    
    public Rating getRating(Person person, Film film) {
        if(!this.personalRatings.containsKey(person)) {
            return Rating.NOT_WATCHED;
        }
        if(!this.personalRatings.get(person).containsKey(film)) {
            return Rating.NOT_WATCHED;
        }
        
        return this.personalRatings.get(person).get(film);
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person) {
        Map<Film, Rating> ratings = new HashMap<Film, Rating>();
        
        if(this.personalRatings.containsKey(person)) {
            for (Entry<Film, Rating> entry : this.personalRatings.get(person).entrySet()) {
                ratings.put(entry.getKey(), entry.getValue());
            }
        }
        
        return ratings;
    }
    
    public List<Person> reviewers() {
        List<Person> persons = new ArrayList<Person>();
        for (Person p : this.personalRatings.keySet()) {
            persons.add(p);
        }
        return persons;
    }
    
    public List<Rating> getRatings(Film film) {
        return this.filmRatings.get(film);
    }
    
    public Map<Film, List<Rating>> filmRatings() {
        return this.filmRatings;
    }
}
