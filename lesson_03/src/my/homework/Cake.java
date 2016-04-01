package my.homework;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Kirill on 01.04.2016.
 */
public class Cake {

    private int egg;
    private int flour;
    private int water;
    private String cakeName;
    private Date coockingTime;
    private int weight;

    public String getCakeName() {
        return cakeName;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getFlour() {
        return flour;
    }

    public void setFlour(int flour) {
        this.flour = flour;
    }

    public Cake(int egg, int flour, int water, String cakeName) {
        this.egg = egg;
        this.flour = flour;
        this.water = water;
        this.cakeName = cakeName;
    }

    public void make() {
        weight = flour + (egg * 30) + water / 10;
        coockingTime = new Date((weight / 10) * 1000);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cake{");
        sb.append("weight=" + weight);
        sb.append(", coockingTime=" + new SimpleDateFormat("mm:ss").format(coockingTime));
        sb.append(", cakeName='" + cakeName + "'");
        sb.append("}\n");
        return sb.toString();
    }
}
