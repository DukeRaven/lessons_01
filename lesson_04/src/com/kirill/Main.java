package com.kirill;

import com.kirill.model.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    private static int getRandomInt(int minValue, int maxValue) {
        return minValue + (int) (Math.random() * ((maxValue - minValue) + 1));
    }

    private static Date getRandomBurthDate(int minYear, int maxYear) {
        Date d = null;
        try {
            d = new SimpleDateFormat("ddmmyyyy").parse(("0101" + getRandomInt(1980, 1990)));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return d;
    }


    public static void main(String[] args) {
        Life[] life = new Life[8];

        life[0] = new Women(getRandomBurthDate(1980, 1990), null, (float) 1.7, 50, "Jane", "Doe", false);
        life[1] = new Women(getRandomBurthDate(1980, 1990), null, (float) 1.6, 45, "Angelina", "Jolie", false);

        life[2] = new Man(getRandomBurthDate(1980, 1990), null, (float) 1.8, 80, "John", "Doe", false);
        life[3] = new Man(getRandomBurthDate(1980, 1990), null, (float) 1.9, 75, "Brad", "Pitt", false);

        life[4] = new Dog(getRandomBurthDate(1980, 1990), null, (float) 0.5, 15, "Bobik", (float) 1, "Male", 4, 20, (float) 40, new String[]{"Jumping", "Playng"});
        life[5] = new Dog(getRandomBurthDate(1980, 1990), null, (float) 0.5, 15, "Jessy", (float) 1, "Female", 4, 20, (float) 40, new String[]{"Jumping", "Playng"});

        life[6] = new Cat(getRandomBurthDate(1980, 1990), null, (float) 0.5, 15, "Jessy", (float) 1, "Female", 4, 20, 7);

        life[7] = new Parrot(getRandomBurthDate(1980, 1990), null, (float) 0.5, 15, "Jessy", (float) 1, "Female", 2, 0, (float) 0.3, true);

        //
        float totalWeight = 0, totalHumanWeight = 0, totalAnimalWeight = 0;
        int humansNumber = 0, animalsNumber = 0;
        for (Life l : life) {
            totalWeight += l.getWeight();
            if (l instanceof Human) {
                humansNumber++;
                totalHumanWeight += l.getWeight();
            } else if (l instanceof Animal) {
                animalsNumber++;
                totalAnimalWeight += l.getWeight();
            }
        }
        System.out.println("Total weight: " + totalWeight);
        System.out.println("Average weight of humans: " + totalHumanWeight / humansNumber);
        System.out.println("Average weight of animals: " + totalAnimalWeight / animalsNumber);

        for (Life l : life) {
            IEat e = (IEat) l;
            e.eat("apple");
        }


    }
}
