package com.kirill.model;

import java.util.Date;

/**
 * Created by Kirill on 13.04.2016.
 */
public class Parrot extends Animal {
    private float wingspan;
    private boolean isFlying;

    public float getWingspan() {
        return wingspan;
    }

    public void setWingspan(float wingspan) {
        this.wingspan = wingspan;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    @Override
    public void walk() {
        if (isFlying)
            System.out.println("Parrot flying");
        else
            System.out.println("Parrot walking");
    }

    @Override
    public void say() {
        System.out.println("Parrot said 'O, Poor Robinson Crusoe!'");
    }

    public Parrot(Date birthDate, Date deathDate, float height, float weight, String name, float length, String sex, int pawsNumber, int teethNumber, float wingspan, boolean isFlying) {
        super(birthDate, deathDate, height, weight, name, length, sex, pawsNumber, teethNumber);
        this.wingspan = wingspan;
        this.isFlying = isFlying;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "wingspan=" + wingspan +
                ", isFlying=" + isFlying +
                super.toString() +
                '}';
    }
}
