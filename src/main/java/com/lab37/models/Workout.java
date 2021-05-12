package com.lab37.models;

public class Workout {
    private String name;
    private double colories;

    public Workout(String name, double colories) {
        this.name = name;
        this.colories = colories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getColories() {
        return colories;
    }

    public void setColories(double colories) {
        this.colories = colories;
    }

    public double calcCalories(double time) {
        return this.colories * (time / 3600.0); // количество прошедших секунд делим на 60 секунд в минуте, уменоженное на 60 минут в часе
    }
}
