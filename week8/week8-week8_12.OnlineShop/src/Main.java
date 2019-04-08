
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // testing Storehouse class
//        Storehouse store = new Storehouse();
//        store.addProduct("milk", 3, 10);
//        store.addProduct("coffee", 5, 6);
//        store.addProduct("buttermilk", 2, 20);
//        store.addProduct("jogurt", 2, 20);
//        
//        System.out.println("products: ");
//        for (String product : store.products()) {
//            System.out.println(product);
//        }
//        
//        System.out.println("stocks: ");
//        System.out.println("coffee: " + store.stock("coffee"));
//        System.out.println("sugar: " + store.stock("sugar"));
//        
//        System.out.println("we take a coffee " + store.take("coffee"));
//        System.out.println("we take a coffee " + store.take("coffee"));
//        System.out.println("we take sugar " + store.take("sugar"));
//        
//        System.out.println("stocks: ");
//        System.out.println("coffee: " + store.stock("coffee"));
//        System.out.println("sugar: " + store.stock("sugar"));

        // testing Purchase class
//        Purchase purchase = new Purchase("milk", 4, 2);
//        System.out.println("the total price of a purchase containing four milks is " + purchase.price());
//        System.out.println(purchase);
//        purchase.increaseAmount();
//        System.out.println(purchase);
        
        // testing ShoppingBasket class
//        ShoppingBasket basket = new ShoppingBasket();
//        basket.add("milk", 3);
//        basket.print();
//        System.out.println("basket price: " + basket.price());
//        System.out.println();
//        
//        basket.add("buttermilk", 2);
//        basket.print();
//        System.out.println("basket price: " + basket.price());
//        System.out.println();
//        
//        basket.add("milk", 3);
//        basket.print();
//        System.out.println("basket price: " + basket.price());
//        System.out.println();
//        
//        basket.add("milk", 3);
//        basket.print();
//        System.out.println("basket price: " + basket.price());
//        System.out.println();

        // testing the Shop class
        Storehouse store = new Storehouse();
        store.addProduct("coffee", 5, 10);
        store.addProduct("milk", 3, 20);
        store.addProduct("milkbutter", 2, 55);
        store.addProduct("bread", 7, 8);
        
        Shop shop = new Shop(store, new Scanner(System.in));
        shop.manage("Pekka");
        
    } // END OF MAIN
}
