package com.kirill.model;

import java.util.Date;

/**
 * Created by Kirill on 13.04.2016.
 */
public abstract class Human extends Life implements IEat {
    protected String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public abstract void walk();

    public abstract void say();

    @Override
    public void eat(String food) {
        System.out.println("Human with class " + this.getClass().getName() + " enjoys " + food);
    }

    public Human(Date birthDate, Date deathDate, float height, float weight, String name, String surname) {
        super(birthDate, deathDate, height, weight, name);
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Human{" +
                "surname='" + surname + '\'' +
                super.toString() +
                '}';
    }
}
