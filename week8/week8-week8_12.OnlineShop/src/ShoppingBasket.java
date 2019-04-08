
import java.util.ArrayList;
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
public class ShoppingBasket {
    
    private List<Purchase> purchases;
    
    public ShoppingBasket() {
        this.purchases = new ArrayList<Purchase>();
    }
    
    public void add(String product, int price) {
        boolean productFound = false;
        
        for (Purchase purchase : this.purchases) {
            if (purchase.getProduct().equals(product)) {
                purchase.increaseAmount();
                productFound = true;
            }
        }
        
        if (!productFound) {
            this.purchases.add(new Purchase(product, 1, price));
        }
    }
    
    public int price() {
        int price = 0;
        
        for (Purchase purchase : this.purchases) {
            price += purchase.price();
        }
        
        return price;
    }
    
    public void print() {
        for (Purchase purchase : this.purchases) {
            System.out.println(purchase);
        }
    }
}
