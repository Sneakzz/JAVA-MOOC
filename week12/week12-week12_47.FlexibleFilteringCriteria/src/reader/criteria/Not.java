/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Kenny
 */
public class Not implements Criterion{

    private Criterion lengthAtLeast;
    
    public Not(Criterion lengthAtLeast) {
        this.lengthAtLeast = lengthAtLeast;
    }
    
    @Override
    public boolean complies(String line) {
        return !this.lengthAtLeast.complies(line);
    }
    
}
