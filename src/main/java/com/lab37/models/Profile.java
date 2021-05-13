package com.lab37.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import static java.lang.Math.round;

@XmlRootElement(name = "profile")
@XmlAccessorType(XmlAccessType.FIELD)
public class Profile {
    private String name;
    private double colories;

    public Profile(String login) {
        this.name = login;
        this.colories = 0;
    }

    public Profile() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getColories() {
        return Math.round(colories * 100.0) / 100.0;
    }

    public void setColories(double colories) {
        colories = Math.round(colories * 100.0) / 100.0;
        this.colories = colories;
    }

    public void increaseSum(double value) {
        this.setColories(this.colories + value);
    }

}
