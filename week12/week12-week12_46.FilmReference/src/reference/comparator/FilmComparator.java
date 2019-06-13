/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.*;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author Kenny
 */
public class FilmComparator implements Comparator<Film>{
    
    private Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    @Override
    public int compare(Film o1, Film o2) {
        if(!this.ratings.containsKey(o1) || !this.ratings.containsKey(o2)) {
            return 0;
        }
        
        int firstAverage = this.getAverage(this.ratings.get(o1));
        int secondAverage = this.getAverage(this.ratings.get(o2));
        
        return secondAverage - firstAverage;
    }
    
    private int getAverage(List<Rating> ratingList) {
        int value = 0;
        for (Rating r : ratingList) {
            value += r.getValue();
        }
        
        return value / ratingList.size();
    }
}
