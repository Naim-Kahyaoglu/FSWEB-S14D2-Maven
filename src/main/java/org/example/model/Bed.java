package org.example.model;

public class Bed {
    // Instance değişkenleri
    private String style;      // Yatak stili
    private int pillows;       // Yastık sayısı
    private int height;        // Yükseklik
    private int sheets;        // Çarşaf sayısı
    private int quilts;         // Yorgan sayısı

    // Constructor
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilt;
    }

    // make metodu: Mesaj bastıran metot
    public void make() {
        System.out.println("The bed is being made.");
    }

    // Getter metotları
    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {  // Getter metodunu ekleyelim
        return quilts;
    }

    public String getStyle() {
        return style;
    }
}
