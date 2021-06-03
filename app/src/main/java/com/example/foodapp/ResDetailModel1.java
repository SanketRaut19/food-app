package com.example.foodapp;

public class ResDetailModel1 {
    private int image;
    private int pos;

    public ResDetailModel1(int image, int pos) {
        this.image = image;
        this.pos = pos;
    }

    public void setImage(int image){
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public int getPos(){
        return pos;
    }

}
