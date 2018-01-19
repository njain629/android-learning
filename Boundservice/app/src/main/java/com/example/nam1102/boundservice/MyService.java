package com.example.nam1102.boundservice;

import android.app.Service;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.os.Binder;
import android.os.IBinder;

import java.util.Date;
import java.util.Locale;

public class MyService extends Service {
    private final IBinder mybinder=new mylocalbinder();

    public MyService() {
    }
    public class mylocalbinder extends Binder {
        MyService getservice(){
            return MyService.this;
        }
    }

    public String getcurrentime(){
        SimpleDateFormat df= new SimpleDateFormat("HH:mm:ss", Locale.UK);
        return (df.format(new Date()));
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mybinder;
    }
}
