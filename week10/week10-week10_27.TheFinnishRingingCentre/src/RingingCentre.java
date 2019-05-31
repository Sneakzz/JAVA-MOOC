
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kenny
 */
public class RingingCentre {

    private Map<Bird, List<String>> places;

    public RingingCentre() {
        this.places = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        if (!this.places.containsKey(bird)) {
            this.places.put(bird, new ArrayList<String>());
        }
        this.places.get(bird).add(place);
    }

    public void observations(Bird bird) {
        if (!this.places.containsKey(bird)) {
            System.out.println(bird + "observations: 0");
        } else {
            System.out.println(bird + " observations: " + this.places.get(bird).size());

            for (String place : this.places.get(bird)) {
                System.out.println(place);
            }
        }
    }
}
