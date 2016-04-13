package com.kirill.model;

import java.util.Date;

/**
 * Created by Kirill on 13.04.2016.
 */
public class Cat extends Animal {
    private int lifeNumber;

    public int getLifeNumber() {
        return lifeNumber;
    }

    public void setLifeNumber(int lifeNumber) {
        this.lifeNumber = lifeNumber;
    }

    @Override
    public void walk() {
        System.out.println("Cat walking");
    }

    @Override
    public void say() {
        System.out.println("Cat said 'Meow'");
    }

    public Cat(Date birthDate, Date deathDate, float height, float weight, String name, float length, String sex, int pawsNumber, int teethNumber, int lifeNumber) {
        super(birthDate, deathDate, height, weight, name, length, sex, pawsNumber, teethNumber);
        this.lifeNumber = lifeNumber;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "lifeNumber=" + lifeNumber +
                super.toString() +
                '}';
    }
}
