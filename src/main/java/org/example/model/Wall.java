package org.example.model;

public class Wall {
    // Instance değişkeni
    private String direction;  // Duvar yönü

    // Constructor: direction değerine atama yapar
    public Wall(String direction) {
        this.direction = direction;
    }

    // getDirection metodu: direction değerini döner
    public String getDirection() {
        return direction;
    }

    // create metodu: Mesaj yazdırır
    public void create() {
        System.out.println("Wall has been built.");
    }
}
