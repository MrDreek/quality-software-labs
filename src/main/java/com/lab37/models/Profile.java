package com.lab37.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "profile")
@XmlAccessorType(XmlAccessType.FIELD)
public class Profile {
    private String name;
    private double colories;

    public Profile(String login) {
        this.name = login;
        this.colories = 0;
    }

    public Profile() {}

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

    public void increaseSum(double value) {
        this.colories += value;
    }

}
