package com.kirill.model;

import java.util.Date;

/**
 * Created by Kirill on 13.04.2016.
 */
public class Women extends Human {
    private boolean isPregnant;

    public boolean isPregnant() {
        return isPregnant;
    }

    public void setPregnant(boolean pregnant) {
        isPregnant = pregnant;
    }

    @Override
    public void walk() {
        System.out.println("Woman walking");
    }

    @Override
    public void say() {
        System.out.println("Woman said 'Hello'");
    }

    public Women(Date birthDate, Date deathDate, float height, float weight, String name, String surname, boolean isPregnant) {
        super(birthDate, deathDate, height, weight, name, surname);
        this.isPregnant = isPregnant;
    }

    @Override
    public String toString() {
        return "Women{" +
                "isPregnant=" + isPregnant +
                super.toString() +
                '}';
    }
}
