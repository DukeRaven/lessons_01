package com.kirill.model;

import java.util.Date;

/**
 * Created by Kirill on 13.04.2016.
 */
public class Man extends Human{

    private boolean isHaveBeard;

    public boolean isHaveBeard() {
        return isHaveBeard;
    }

    public void setHaveBeard(boolean haveBeard) {
        isHaveBeard = haveBeard;
    }

    @Override
    public void walk() {
        System.out.println("Man walking");
    }

    @Override
    public void say() {
        System.out.println("Man said 'Hello!'");
    }

    public Man(Date birthDate, Date deathDate, float height, float weight, String name, String surname, boolean isHaveBeard) {
        super(birthDate, deathDate, height, weight, name, surname);
        this.isHaveBeard = isHaveBeard;
    }
}
