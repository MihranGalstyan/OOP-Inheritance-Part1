package models;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Cat extends CatFamily{
    public Cat (){
        super(2,4,false);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("mouse");
    }
}