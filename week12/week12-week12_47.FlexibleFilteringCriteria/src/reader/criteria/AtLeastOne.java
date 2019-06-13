/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.*;

/**
 *
 * @author Kenny
 */
public class AtLeastOne implements Criterion{
    
    private List<Criterion> criteria;

    public AtLeastOne(Criterion... criterion) {
        this.criteria = new ArrayList<Criterion>();
        
        for(Criterion c: criterion) {
            this.criteria.add(c);
        }
    }
    
    @Override
    public boolean complies(String line) {
        boolean isComplying = false;
        
        for(Criterion c : this.criteria) {
            if(c.complies(line)) {
                isComplying = true;
            }
        }
        
        return isComplying;
    }
    
}
