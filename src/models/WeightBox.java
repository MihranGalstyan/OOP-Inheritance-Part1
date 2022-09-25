package models;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class WeightBox extends Box {
    private int weight;

    public void setWeight(final int weight) {
        this.weight = weight;
    }

    public WeightBox(final int height, final int width, final int length, final int weight) {
        super(height, width, length);
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(", Weight: " + weight);
    }
}
