package org.example.model;

import org.example.model.enums.PaintColor;

public class Carpet {

    // Instance variables
    private int width;
    private int height;
    private PaintColor color;

    // Constructor
    public Carpet(int width, int height, PaintColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Getter methods
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    // lying method
    public void lying() {
        System.out.println("Carpet is lying on Bedroom floor.");
    }
}
