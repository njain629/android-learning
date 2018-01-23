package com.example.nam1102.mydataapp;

/**
 * Created by nam1102 on 21/1/18.
 */

public class product {
    private int _id;
    private String _name;

    public product() {

    }

    public product(String name) {
        this._name = name;
    }

    public void set_id(int id) {
        this._id = id;
    }

    public void set_name(String name) {
        this._name = name;
    }

    public int get_id() {
        return _id;
    }

    public String get_name() {
        return _name;
    }
}
