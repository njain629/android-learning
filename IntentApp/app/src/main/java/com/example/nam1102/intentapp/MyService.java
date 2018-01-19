package com.example.nam1102.intentapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.util.Log;

public class MyService extends Service {
    private static final String tag="com.example.nam1102.intentapp";
    public MyService() {

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(tag,"onstart called");
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++){
                    long ftime =System.currentTimeMillis()+5000;
                    while(System.currentTimeMillis()<ftime){
                        synchronized (this){
                            try{
                                wait(ftime-System.currentTimeMillis());
                                Log.i(tag,"service running");
                            }catch(Exception e){

                            }
                        }
                    }
                }
            }
        };
        Thread myt=new Thread(r);
        myt.start();
        return Service.START_STICKY;
    }

    @Override
    public void onDestroy() {
        Log.i(tag,"ondestoy called");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
