package com.example.foodapp;

public class ResDetailModel2 {

    String name ;
    int  rev_num, detail;
    float review;

    public ResDetailModel2(String name, int detail, float review, int rev_num) {
        this.name = name;
        this.rev_num = rev_num;
        this.review = review;
        this.detail = detail;
    }

    public String getName() {
        return name;
    }


    public int getRev_num() {
        return rev_num;
    }

    public float getReview() {
        return review;
    }

    public int getDetail(){
        return detail;
    }
}
