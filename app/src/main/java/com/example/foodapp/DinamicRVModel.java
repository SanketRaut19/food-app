package com.example.foodapp;

public class DinamicRVModel {

    String name;
    private int image;
    int pos;

    public DinamicRVModel(String name, int image, int pos) {
        this.name = name;
        this.image = image;
        this.pos = pos;
    }

    public String getName() {
        return name;
    }

    public  int getImage(){
        return image;
    }

    public int getPos(){
        return pos;
    }
}
