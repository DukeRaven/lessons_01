package com.kirill.model;

import java.util.Date;

/**
 * Created by Kirill on 13.04.2016.
 */
public abstract class Life {

    protected Date birthDate;
    protected Date deathDate;
    protected float height;
    protected float weight;
    protected String name;

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Life(Date birthDate, Date deathDate, float height, float weight, String name) {
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Life{" +
                "birthDate=" + birthDate +
                ", deathDate=" + deathDate +
                ", height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
