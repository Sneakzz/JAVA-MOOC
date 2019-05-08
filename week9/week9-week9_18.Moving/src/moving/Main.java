package moving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moving.domain.Box;
import moving.domain.Item;
import moving.domain.Thing;
import moving.logic.Packer;

public class Main {

    public static void main(String[] args) {
        // testing the Item class
//        List<Item> items = new ArrayList<Item>();
//        items.add(new Item("passport", 2));
//        items.add(new Item("toothbrash", 1));
//        items.add(new Item("circular saw", 100));

        //System.out.println(items);
//        Collections.sort(items);
//        System.out.println(items);
        // testing the Packer class
        // things we want to pack
        List<Thing> things = new ArrayList<Thing>();
        things.add(new Item("passport", 2));
        things.add(new Item("toothbrash", 1));
        things.add(new Item("book", 4));
        things.add(new Item("circular saw", 8));

        // create a packer object which uses boxes whose volume is 10
        Packer packer = new Packer(10);

        // ask the packer object to pack things into boxes
        List<Box> boxes = packer.packThings(things);

        System.out.println("number of boxes: " + boxes.size());

        for (Box box : boxes) {
            System.out.println("  things in the box: " + box);
        }

        // test code
        Item item1 = new Item("stone", 5);
        Item item2 = new Item("record", 5);
        System.out.println(item1.compareTo(item2));
    }
}
