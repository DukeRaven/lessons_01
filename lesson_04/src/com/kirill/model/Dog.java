package com.kirill.model;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Kirill on 13.04.2016.
 */
public class Dog extends Animal {
    private float speed;
    private String[] skills;

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }


    @Override
    public void walk() {
        System.out.println("Dog walking");
    }

    @Override
    public void say() {
        System.out.println("Dog said 'GAV'");
    }

    public Dog(Date birthDate, Date deathDate, float height, float weight, String name, float length, String sex, int pawsNumber, int teethNumber, float speed, String[] skills) {
        super(birthDate, deathDate, height, weight, name, length, sex, pawsNumber, teethNumber);
        this.speed = speed;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "speed=" + speed +
                ", skills=" + Arrays.toString(skills) +
                super.toString() +
                '}';
    }
}
