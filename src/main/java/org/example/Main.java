package org.example;

import org.example.model.Bed;
import org.example.model.Lamp;
import org.example.model.enums.LampType;
import org.example.model.Wardrobe;
import org.example.model.Ceiling;
import org.example.model.enums.PaintColor;
import org.example.model.Wall;
import org.example.model.Carpet;
import org.example.model.Bedroom;

public class Main {
    public static void main(String[] args) {
        // Lamp instance
        Lamp lamp = new Lamp(LampType.NEON, true, 5);
        lamp.turnOn();  // Lamp'ı aç
        System.out.println("Lamp style: " + lamp.getStyle());  // NEON
        System.out.println("Has battery: " + lamp.isBattery());  // true
        System.out.println("Glob rating: " + lamp.getGlobRating());  // 5

        // Bed instance
        Bed bed = new Bed("Modern", 4, 60, 2, 1);
        bed.make();  // "The bed is being made."
        System.out.println("Pillows: " + bed.getPillows());  // 4
        System.out.println("Height: " + bed.getHeight());  // 60
        System.out.println("Sheets: " + bed.getSheets());  // 2
        System.out.println("Quilts: " + bed.getQuilts());  // 1

        // Wardrobe instance
        Wardrobe wardrobe = new Wardrobe(100, 200, 75.5);
        wardrobe.add();  // "Wardrobe added into Bedroom."
        System.out.println("Wardrobe width: " + wardrobe.getWidth());  // 100
        System.out.println("Wardrobe height: " + wardrobe.getHeight());  // 200
        System.out.println("Wardrobe weight: " + wardrobe.getWeight());  // 75.5

        // Ceiling instance
        Ceiling ceiling = new Ceiling(250, PaintColor.WHITE);
        ceiling.create();  // "Ceiling has been built."
        System.out.println("Ceiling height: " + ceiling.getHeight());  // 250
        System.out.println("Ceiling color: " + ceiling.getColor());  // WHITE

        // Wall instances
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Carpet carpet = new Carpet(3, 5, PaintColor.RED);  // PaintColor.RED kullanarak rengi belirliyoruz

        // Carpet metodunu çağırıyoruz
        carpet.lying();  // "Carpet is lying on Bedroom floor." mesajını yazdırır

        // Getter metodları ile halının özelliklerini yazdırıyoruz
        System.out.println("Carpet width: " + carpet.getWidth());  // 3
        System.out.println("Carpet height: " + carpet.getHeight());  // 5
        System.out.println("Carpet color: " + carpet.getColor());  // RED

        // Bedroom instance
        Bedroom bedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        // Bedroom information
        System.out.println("Bedroom name: " + bedroom.getName());
        System.out.println("Wall1 direction: " + bedroom.getWall1().getDirection());  // North
        System.out.println("Ceiling height: " + bedroom.getCeiling().getHeight());  // 250
        System.out.println("Bed style: " + bedroom.getBed().getPillows());  // 4
        System.out.println("Lamp rating: " + bedroom.getLamp().getGlobRating());  // 5
        System.out.println("Wardrobe width: " + bedroom.getWardrobe().getWidth());  // 100
        System.out.println("Carpet color: " + bedroom.getCarpet().getColor());  // Red
    }
}
