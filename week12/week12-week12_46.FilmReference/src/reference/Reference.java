/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.*;
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.*;

/**
 *
 * @author Kenny
 */
public class Reference {

    private RatingRegister ratingRegister;

    public Reference(RatingRegister ratingRegister) {
        this.ratingRegister = ratingRegister;
    }

    public Film recommendFilm(Person person) {
        if (this.ratingRegister.getPersonalRatings(person).isEmpty()) {
            return this.noFilmsWatched();
        } else {
            return this.filmsWatched(person);
        }
    }

    private Film noFilmsWatched() {
        Map<Film, List<Rating>> ratings = this.ratingRegister.filmRatings();
        List<Film> films = new ArrayList<Film>();

        for (Film f : ratings.keySet()) {
            films.add(f);
        }

        Collections.sort(films, new FilmComparator(ratings));
        return films.get(0);
    }

    private Film filmsWatched(Person person) {
        // get a list of reviewers
        List<Person> reviewers = this.ratingRegister.reviewers();
        // create a Map for every reviewer with their comparison rating
        // except for the reviewer passed into this method
        Map<Person, Integer> comparedRatingsMap = new HashMap<Person, Integer>();
        
        // get and use an Iterator to go over every reviewer so we can remove the reviewer
        // passed in to this method from the list of reviewers
        Iterator<Person> iterator = reviewers.iterator();
        
        while(iterator.hasNext()) {
            // grab the next person in the list
            Person compared = iterator.next();
            
            // check if the compared person is the same as the one passed in
            // and if so remove this person from the list
            if(compared.equals(person)) {
                iterator.remove();
            }
            
            // create a map with the films and ratings the reviewer passed in has
            Map<Film, Rating> personRatings = this.ratingRegister.getPersonalRatings(person);
            // create a map with the films and ratings the compared reviewer has
            Map<Film, Rating> comparedRatings = this.ratingRegister.getPersonalRatings(compared);
            
            // start the comparison rating calculation
            int comparisonRating = 0;
            
            // go over every film the compared reviewer has seen
            for (Film f : comparedRatings.keySet()) {
                // if the film has been watched by the reviewer passed in AND
                // the rating that this reviewer gave the film is other than 0
                if(this.isWatched(f, person) && personRatings.get(f).getValue() != 0) {
                    comparisonRating += comparedRatings.get(f).getValue() * personRatings.get(f).getValue();
                }
            }
            
            // check the comparisonRating and store this comparison rating value
            // for the just compared reviewer in the comparedRatingsMap
            if(comparisonRating != 0) {
                comparedRatingsMap.put(compared, comparisonRating);
            } else {
                comparedRatingsMap.put(compared, 0);
            }
        }
        
        // after iterating over every reviewer, getting and storing their comparison rating
        // we sort the reviewers list based on the comparedRatingsMap values for each reviewer.
        Collections.sort(reviewers, new PersonComparator(comparedRatingsMap));
        
        // get the personal film ratings of the reviewer with the highest comparison rating
        Map<Film, Rating> bestComparisonRating = this.ratingRegister.getPersonalRatings(reviewers.get(0));
        
        // go over every film the highest comparison rating reviewer has reviewed
        // to find out which is the best recommendation
        int bestRating = 0;
        Film recommended = null;
        
        for (Film f : bestComparisonRating.keySet()) {
            if(bestComparisonRating.get(f).getValue() > bestRating && !this.isWatched(f, person)) {
                bestRating = bestComparisonRating.get(f).getValue();
                recommended = f;
            }
        }
        
        return recommended;
    }
    
    private boolean isWatched(Film f, Person person) {
        // to determine if a film has been seen by a particular reviewer we first
        // get a map of this reviewers reviews
        Map<Film, Rating> reviewed = this.ratingRegister.getPersonalRatings(person);
        
        if(reviewed.containsKey(f) && reviewed.get(f).getValue() != 0) {
            return true;
        }
        
        return false;
    }
}
