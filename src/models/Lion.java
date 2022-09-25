package models;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Lion extends CatFamily{
    public Lion (){
        super(2,4,true);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("monkey");
    }
}
