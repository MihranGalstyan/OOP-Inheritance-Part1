package main;

import models.Cat;
import models.Lion;
import models.WeightBox;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Main {
    public static void main(final String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();

        System.out.println(lion.getLegs());
        System.out.println(cat.hasBigClaws());
        System.out.println();
        cat.showInfo();
        System.out.println();
        lion.showInfo();

        cat.eat();
        lion.eat();

        WeightBox weightBox = new WeightBox(12,4,16,45);
        weightBox.showInfo();
    }
}
