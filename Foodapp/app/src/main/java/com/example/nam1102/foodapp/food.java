package com.example.nam1102.foodapp;

/* Created by nam1102 on 30/9/17.
         */

public class food {
    private String name;
    private String desp;
    private int imageID;

    public static final food[] foods={
            new food("Pizza", "Thin Crust pizza with extra cheese",R.drawable.pizza),
            new food("Burger", "Burger With Healthy stuff",R.drawable.burger),
            new food("Sandwich", "Whole wheat sandwich",R.drawable.sandwich),
    };

    public food(String name, String desp,int imageID) {
        this.name=name;
        this.desp=desp;
        this.imageID=imageID;
    }

    public String getName(){
        return name;
    }
    public String getDesc(){
        return desp;
    }
    public String toString(){
        return this.name;
    }
    public int getimageID(){
        return this.imageID;
    }
}
