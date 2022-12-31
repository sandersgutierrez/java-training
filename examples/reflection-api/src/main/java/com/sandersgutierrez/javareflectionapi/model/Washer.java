package com.sandersgutierrez.javareflectionapi.model;

public class Washer {

    private long id;
    private String model;
    private String description;

    public Washer() {
    }

    public Washer(long id, String model) {
        this.id = id;
        this.model = model;
    }

    public Washer(long id, String model, String description) {
        this.id = id;
        this.model = model;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
