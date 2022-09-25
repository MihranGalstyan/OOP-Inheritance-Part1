package models;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class CatFamily {
    private int ears;
    private int legs;
    private boolean bigClaws;

    public int getEars() {
        return ears;
    }

    public int getLegs() {
        return legs;
    }

    public boolean hasBigClaws() {
        return bigClaws;
    }

    public void setEars(final int ears) {
        this.ears = ears;
    }

    public void setLegs(final int legs) {
        this.legs = legs;
    }

    public void setBigClaws(final boolean bigClaws) {
        this.bigClaws = bigClaws;
    }

//    CatFamily(){
//        new CatFamily(2,4,true);
////        ears = 2;
////        legs = 4;
////        bigClaws = true;
//    }

    public CatFamily(final int ears, final int legs, final boolean bigClaws) {
        this.ears = ears;
        this.legs = legs;
        this.bigClaws = bigClaws;
    }

    public void showInfo (){
        System.out.println("Ears: " + ears + "\nLegs: " + legs + "\nBig claws: " + bigClaws);
    }

    public void eat(){
        System.out.print("Eating ");
    }
}
