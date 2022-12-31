package com.sandersgutierrez.javareflectionapi.model;

public class Computer {

    private long id;
    private int power;
    private String description;

    public Computer() {
    }

    public Computer(long id, int power) {
        this.id = id;
        this.power = power;
    }

    public Computer(long id, int power, String description) {
        this.id = id;
        this.description = description;
        this.power = power;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
