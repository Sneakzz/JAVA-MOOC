
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenny
 */
public class Hand implements Comparable<Hand>{
    
    private List<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<Card>();
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(this.cards);
    }
    
    private int sumOfValues() {
        int result = 0;
        for (Card card : this.cards) {
            result += card.getValue();
        }
        
        return result;
    }
    
    public void sortAgainstSuit() {
        SortAgainstSuitAndValue suitsorter = new SortAgainstSuitAndValue();
        Collections.sort(this.cards, suitsorter);
    }

    @Override
    public int compareTo(Hand o) {
        return this.sumOfValues() - o.sumOfValues();
    }
}
