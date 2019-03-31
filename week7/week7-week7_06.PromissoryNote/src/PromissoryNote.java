
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenny
 */
public class PromissoryNote {
    
    private HashMap<String, Double> loans;
    
    public PromissoryNote() {
        this.loans = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value) {
        toWhom = cleanString(toWhom);
        
        this.loans.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose) {
        whose = cleanString(whose);
        
        if (this.loans.containsKey(whose)) {
            return this.loans.get(whose);
        }
        
        return 0;
    }
    
    public String cleanString(String string) {
        if (string.isEmpty()) {
            return "";
        }
        
        string = string.toLowerCase();
        return string.trim();
    }
}
