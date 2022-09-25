package models;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Box {
    private int height;
    private int width;
    private int length;

    public Box(final int height, final int width, final int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public void showInfo(){
        System.out.print("Height: " + height + ", " + "Width: " + width + ", " + "Length: " + length);
    }
}
