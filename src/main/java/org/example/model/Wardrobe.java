package org.example.model;

public class Wardrobe {
    // Instance değişkenleri
    private int width;    // Gardırop genişliği
    private int height;   // Gardırop yüksekliği
    private double weight; // Gardırop ağırlığı

    // Constructor
    public Wardrobe(int width, int height, double weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    // Getter metotları
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // add metodu: Mesaj bastırır
    public void add() {
        System.out.println("Wardrobe added into Bedroom.");
    }
}
