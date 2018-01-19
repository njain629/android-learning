package com.example.nam1102.intentapp;


import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class Myintentservice extends IntentService {
    private static final String tag="com.example.nam1102.intentapp";

    public Myintentservice() {
        super("Myintentservice");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(tag, "the service started");

    }
}
