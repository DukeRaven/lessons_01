package com.kirill.model;

import java.util.Date;

/**
 * Created by Kirill on 13.04.2016.
 */
public abstract class Animal extends Life implements IEat{

    protected float length;
    protected String sex;
    protected int pawsNumber;
    protected int teethNumber;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getPawsNumber() {
        return pawsNumber;
    }

    public void setPawsNumber(int pawsNumber) {
        this.pawsNumber = pawsNumber;
    }

    public int getTeethNumber() {
        return teethNumber;
    }

    public void setTeethNumber(int teethNumber) {
        this.teethNumber = teethNumber;
    }

    public abstract void walk();

    public abstract void say();

    @Override
    public void eat(String food) {
        System.out.println("Animal with class " + this.getClass().getName() + " enjoys " + food);
    }

    public Animal(Date birthDate, Date deathDate, float height, float weight, String name, float length, String sex, int pawsNumber, int teethNumber) {
        super(birthDate, deathDate, height, weight, name);
        this.length = length;
        this.sex = sex;
        this.pawsNumber = pawsNumber;
        this.teethNumber = teethNumber;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "length=" + length +
                ", sex='" + sex + '\'' +
                ", pawsNumber=" + pawsNumber +
                ", teethNumber=" + teethNumber +
                super.toString() +
                '}';
    }
}
