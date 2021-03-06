/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author Kenny
 */
public class Packer {

    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();
        Box box = new Box(this.boxesVolume);

        for (Thing item : things) {
            if ((item.getVolume() + box.getVolume()) <= this.boxesVolume) {
                box.addThing(item);
            } else {
                boxes.add(box);
                if (item.getVolume() > this.boxesVolume) {

                } else {
                    box = new Box(this.boxesVolume);
                    box.addThing(item);
                    boxes.add(box);

                }

            }
        }

        return boxes;
    }

}
