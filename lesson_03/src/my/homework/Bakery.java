package my.homework;

import java.util.Arrays;

/**
 * Created by Kirill on 01.04.2016.
 */
public class Bakery {

    private static void makeAll(Cake[] cakes) {
        for (Cake cake : cakes) {
            cake.make();
            System.out.println("Cake ready: " + cake.getCakeName());
        }
    }

    public static void main(String[] args) {
        Cake[] cakes = new Cake[10];

        for (int i = 0; i <= 9; i++) {
            cakes[i] = new Cake(i + 3, (100 * (i + 2)), (100 + (i + 1)), "Cake" + i + 1);
        }

        makeAll(cakes);
        System.out.println(Arrays.toString(cakes));

        for (int i = 0; i < 10; i++) {
            if ((i & 1) == 0)
                cakes[i].setFlour(cakes[i].getFlour() + 20);
            else
                cakes[i].setWater(cakes[i].getWater() + 30);
        }

        makeAll(cakes);
        System.out.println(Arrays.toString(cakes));

    }
}
