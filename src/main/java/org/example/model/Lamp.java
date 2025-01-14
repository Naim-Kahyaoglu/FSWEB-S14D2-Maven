package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    private LampType style;  // LampType tipinde bir enum
    private boolean battery;  // boolean tipinde batarya durumu
    private int globRating;  // int tipinde glob rating

    // Constructor
    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    // turnOn metodu: Mesaj bastıran metot
    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }

    // getStyle metodu: LampType döner
    public LampType getStyle() {
        return style;
    }

    // isBattery metodu: boolean döner
    public boolean isBattery() {
        return battery;
    }

    // getGlobRating metodu: int döner
    public int getGlobRating() {
        return globRating;
    }
}
